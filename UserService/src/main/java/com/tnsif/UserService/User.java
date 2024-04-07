package com.tnsif.UserService;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User 

	{
		@Id
		@Column(name="Uid")
	private int userid;
		@Column(name="Uname")
	private String username;
		@Column(name="Uaddress")
	private String useraddress;
		@Column(name="Ucontact")
	private int usercontactnum;
		@Column(name="Uemail")
	private String userEmail;
		@Column(name="Upassword")
	private String userpassword;
		
	public User() {
			super();
			// TODO Auto-generated constructor stub
		}
	public User(int userid, String username, String useraddress, int usercontactnum, String userEmail,
				String userpassword) {
			super();
			this.userid = userid;
			this.username = username;
			this.useraddress = useraddress;
			this.usercontactnum = usercontactnum;
			this.userEmail = userEmail;
			this.userpassword = userpassword;
		}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	public int getUsercontactnum() {
		return usercontactnum;
	}
	public void setUsercontactnum(int usercontactnum) {
		this.usercontactnum = usercontactnum;
	}
	public String getUseremail() {
		return userEmail;
	}
	public void setUseremail(String useremail) {
		this.userEmail = useremail;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", useraddress=" + useraddress + ", usercontactnum="
				+ usercontactnum + ", userEmail=" + userEmail + ", userpassword=" + userpassword + "]";
	}

	
}
