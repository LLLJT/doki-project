package com.ishang.doki.model;

import javax.annotation.Generated;

public class SysUser {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.password")
    private String password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.username")
    private String username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.uage")
    private String uage;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.usex")
    private String usex;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.utelephone")
    private String utelephone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.password")
    public String getPassword() {
        return password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.password")
    public void setPassword(String password) {
        this.password = password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.username")
    public String getUsername() {
        return username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.username")
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.uage")
    public String getUage() {
        return uage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.uage")
    public void setUage(String uage) {
        this.uage = uage;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.usex")
    public String getUsex() {
        return usex;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.usex")
    public void setUsex(String usex) {
        this.usex = usex;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.utelephone")
    public String getUtelephone() {
        return utelephone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.utelephone")
    public void setUtelephone(String utelephone) {
        this.utelephone = utelephone;
    }
}