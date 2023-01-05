package cn.woniu.entity.authority;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (Authority)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:38:48
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Authority {

    private Integer id;

    private String name;

    private Integer parentId;

    private String type;

    private String status;

    private String authCode;

    private String link;


}

