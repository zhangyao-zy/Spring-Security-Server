package com.zy.userSecurityServer.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "tb_role_permission")
public class TbRolePermission implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "role_permission_id")
    @GeneratedValue(generator = "JDBC")
    private Integer rolePermissionId;

    /**
     * 角色主键
     */
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * 权限主键
     */
    @Column(name = "permission_id")
    private Integer permissionId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}