package cn.com.hatechframework.server.role.po;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * copyright (C), 2019, 北京同创永益科技发展有限公司
 *
 * @program hatech-framework
 * @package cn.com.hatechframework.server.role.po
 * @className RolePO
 * @description 角色实体类PO
 * @author WangMingShuai
 * @create 2019/12/23 17:02
 * @version 1.0
 * <author>                <time>                  <version>                   <description>
 * WangMingShuai         2019/12/23 17:02             1.0                         角色实体类PO
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "role")
public class RolePO {

    @TableId(type = IdType.UUID)
    @TableField("id")
    private String id;

    @TableField("role_name")
    private String roleName;

    @TableField("status")
    private Integer status;

    @TableField("description")
    private String description;

    @TableField("edit_user_id")
    private String editUserId;

    @TableField(value = "edit_time",fill = FieldFill.UPDATE)
    private Date editTime;

    @TableField(exist = false)
    private List<String> menuIds;
}
