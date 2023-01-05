package cn.woniu.entity.consumer;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (Consumer)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:38:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Consumer {

    private String id;

    private String userName;

    private String userPwd;

    private String userEmail;


}

