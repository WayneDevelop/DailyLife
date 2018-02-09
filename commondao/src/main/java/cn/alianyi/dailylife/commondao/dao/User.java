package cn.alianyi.dailylife.commondao.dao;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.util.Date;



@Entity
public class User implements Serializable {

    /** serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 主键. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** 用户名. */
    private String userName = "";

    /** 手机号码. */
    private String mobileNo = "";

    /** 邮箱. */
    private String email = "";

    /** 密码. */
    private String password = "";

    /** 用户类型. */
    private Integer userType = 0;

    /** 注册时间. */
    private Date registerTime = new Date();

    /** 所在区域. */
    private String region = "";

    /** 是否有效 0 有效 1 无效. */
    private Integer validity = 0;

    /** 头像. */
    private String headPortrait = "";

    /** 级别. */
    private String level = "";

    /** 预留字段1. */
    private String reserved1 = "";

    /** 预留字段2. */
    private String reserved2 = "";

    /** 预留字段3. */
    private String reserved3 = "";


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getValidity() {
        return validity;
    }

    public void setValidity(Integer validity) {
        this.validity = validity;
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getReserved1() {
        return reserved1;
    }

    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1;
    }

    public String getReserved2() {
        return reserved2;
    }

    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2;
    }

    public String getReserved3() {
        return reserved3;
    }

    public void setReserved3(String reserved3) {
        this.reserved3 = reserved3;
    }
}
