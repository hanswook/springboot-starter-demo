package com.hans.spingbootDemo.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_user")
public class SysUser {
    @Id
    private String id;

    private String username;

    private String password;

    private Integer age;

    /**
     * 0:女  1:男 2:保密
     */
    private Integer sex;

    /**
     * 1:java开发 
2:前端开发
3:大数据开发
4：ios开发
5：android开发
6：linux开发
7：php开发
8：.net开发
9：c/c++开发
10：学生
11：其他
     */
    private Integer job;

    @Column(name = "face_image")
    private String faceImage;

    private String province;

    private String city;

    private String district;

    private String address;

    @Column(name = "auth_salt")
    private String authSalt;

    @Column(name = "last_login_ip")
    private String lastLoginIp;

    @Column(name = "last_login_time")
    private Date lastLoginTime;

    @Column(name = "is_delete")
    private Integer isDelete;

    @Column(name = "regist_time")
    private Date registTime;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取0:女  1:男 2:保密
     *
     * @return sex - 0:女  1:男 2:保密
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置0:女  1:男 2:保密
     *
     * @param sex 0:女  1:男 2:保密
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取1:java开发 
2:前端开发
3:大数据开发
4：ios开发
5：android开发
6：linux开发
7：php开发
8：.net开发
9：c/c++开发
10：学生
11：其他
     *
     * @return job - 1:java开发 
2:前端开发
3:大数据开发
4：ios开发
5：android开发
6：linux开发
7：php开发
8：.net开发
9：c/c++开发
10：学生
11：其他
     */
    public Integer getJob() {
        return job;
    }

    /**
     * 设置1:java开发 
2:前端开发
3:大数据开发
4：ios开发
5：android开发
6：linux开发
7：php开发
8：.net开发
9：c/c++开发
10：学生
11：其他
     *
     * @param job 1:java开发 
2:前端开发
3:大数据开发
4：ios开发
5：android开发
6：linux开发
7：php开发
8：.net开发
9：c/c++开发
10：学生
11：其他
     */
    public void setJob(Integer job) {
        this.job = job;
    }

    /**
     * @return face_image
     */
    public String getFaceImage() {
        return faceImage;
    }

    /**
     * @param faceImage
     */
    public void setFaceImage(String faceImage) {
        this.faceImage = faceImage;
    }

    /**
     * @return province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * @param district
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return auth_salt
     */
    public String getAuthSalt() {
        return authSalt;
    }

    /**
     * @param authSalt
     */
    public void setAuthSalt(String authSalt) {
        this.authSalt = authSalt;
    }

    /**
     * @return last_login_ip
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * @param lastLoginIp
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    /**
     * @return last_login_time
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * @param lastLoginTime
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * @return is_delete
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * @param isDelete
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * @return regist_time
     */
    public Date getRegistTime() {
        return registTime;
    }

    /**
     * @param registTime
     */
    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }
}