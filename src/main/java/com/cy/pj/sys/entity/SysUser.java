package com.cy.pj.sys.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.Getter;

/***
  *  借助此对象封装从数据库查询到的用户及用户对应的部门信息
 * @author Administrator
 *
 */
@Data
public class SysUser implements Serializable{
	private static final long serialVersionUID = 1138534420870847335L;
	private Integer id;
	private String username;
	private String password;//md5
	/**盐值(加密盐-辅助加密,保证密码更加安全)*/
	private String salt;
	private String email;
	private String mobile;
	/**用户状态:1表示启用,0表示禁用*/
	private Integer valid=1;
	/**用户所在部门的部门信息*/
	private Integer deptId; 
	private Date createdTime;
	private Date modifiedTime;
	private String createdUser;
	private String modifiedUser;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Integer getValid() {
		return valid;
	}
	public void setValid(Integer valid) {
		this.valid = valid;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

}
