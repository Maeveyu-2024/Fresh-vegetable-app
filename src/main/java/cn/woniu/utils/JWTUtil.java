package cn.woniu.utils;

import com.nimbusds.jose.*;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jose.crypto.MACVerifier;

import java.text.ParseException;
import java.util.Map;
import java.util.UUID;

public class JWTUtil {

    private static final String KEY = UUID.randomUUID().toString();

    public static String getJWT(Map map) throws JOSEException {
        JWSHeader header = new JWSHeader
                .Builder(JWSAlgorithm.HS256)
                .type(JOSEObjectType.JWT).build();
        Payload payload = new Payload(map);
        JWSSigner signer = new MACSigner(KEY);
        JWSObject jwsObject = new JWSObject(header, payload);
        jwsObject.sign(signer);
        return jwsObject.serialize();
    }

    public static boolean decode(String jwt) throws JOSEException, ParseException {
        JWSObject jwsObject = JWSObject.parse(jwt);
        JWSVerifier jwsVerifier = new MACVerifier(KEY);
        return jwsObject.verify(jwsVerifier);
    }

    public static Map<String, Object> getPayload(String jwt) throws ParseException {
        return JWSObject.parse(jwt).getPayload().toJSONObject();
    }
}
