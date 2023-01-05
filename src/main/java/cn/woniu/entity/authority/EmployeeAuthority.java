package cn.woniu.entity.authority;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (EmployeeAuthority)表实体类
 *
 * @author makejava
 * @since 2023-01-05 11:38:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeAuthority {

    private Integer id;

    private Integer employeeId;

    private Integer authorityId;


}

