package com.sgr.meijia.bean;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class User implements Serializable {


    private static final long serialVersionUID = -8903611686120535883L;
    @Id
    @GeneratedValue     //自增id
    private Integer user_id;

    /**
     * 头衔
     */

    private Title title;

    /**
     * 账号
     */
    private String account;
    /**
     * 密码
     */
    private String password;
    /**
     * token
     */
    private String token;
    /**
     * 姓名
     */
    private String name;
    /**
     * 公司
     */
    private String company;
    /**
     * 地址
     */
    private String avatar;
    /**
     * 账号
     */
    private String location;
    /**
     * 积分
     */
    private String points;
    /**
     * 水印文字
     */
    private String watermark;
    /**
     * uuid1
     */
    private String uuid_one;
    /**
     * uuid2
     */
    private String uuid_two;
    /**
     * 邀请人id
     */
    private String inviter_id;
    /**
     * 称号类别ID
     */
    private String title_id;
    /**
     * 上次修改uuid的时间
     */
    private Date update_date_uuid;//修改uuid的时间
    /**
     * 建号时间
     */
    private Date create_time;
    /**
     * 上次登录时间
     */
    private Date last_login_date;
    /**
     * 用户角色
     */
    private String role;
    /**
     * 功能集合
     */
    private String function;

    public User() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getWatermark() {
        return watermark;
    }

    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }

    public String getUuid_one() {
        return uuid_one;
    }

    public void setUuid_one(String uuid_one) {
        this.uuid_one = uuid_one;
    }

    public String getUuid_two() {
        return uuid_two;
    }

    public void setUuid_two(String uuid_two) {
        this.uuid_two = uuid_two;
    }

    public String getInviter_id() {
        return inviter_id;
    }

    public void setInviter_id(String inviter_id) {
        this.inviter_id = inviter_id;
    }

    public String getTitle_id() {
        return title_id;
    }

    public void setTitle_id(String title_id) {
        this.title_id = title_id;
    }

    public Date getUpdate_date_uuid() {
        return update_date_uuid;
    }

    public void setUpdate_date_uuid(Date update_date_uuid) {
        this.update_date_uuid = update_date_uuid;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getLast_login_date() {
        return last_login_date;
    }

    public void setLast_login_date(Date last_login_date) {
        this.last_login_date = last_login_date;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}
