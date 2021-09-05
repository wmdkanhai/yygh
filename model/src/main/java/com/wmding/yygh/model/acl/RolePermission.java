package com.wmding.yygh.model.acl;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wmding.yygh.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * 角色权限
 *
 * @author wmding
 * @date 9/4/21
 * @describe
 */
@Data
@ApiModel(description = "角色权限")
@TableName("acl_role_permission")
public class RolePermission extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "roleid")
    @TableField("role_id")
    private Long roleId;

    @ApiModelProperty(value = "permissionId")
    @TableField("permission_id")
    private Long permissionId;

}

