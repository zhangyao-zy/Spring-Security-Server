package com.zy.userSecurityServer.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "tb_permission")
public class TbPermission implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "permission_id")
    @GeneratedValue(generator = "JDBC")
    private Integer permissionId;

    /**
     * 权限名称
     */
    @Column(name = "permission_name")
    private String permissionName;

    /**
     * 权限路径
     */
    @Column(name = "permission_url")
    private String permissionUrl;

    /**
     * 权限图标
     */
    @Column(name = "permission_icon")
    private String permissionIcon;

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