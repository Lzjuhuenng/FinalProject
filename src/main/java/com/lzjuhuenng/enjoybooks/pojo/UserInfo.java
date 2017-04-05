package com.lzjuhuenng.enjoybooks.pojo;

public class UserInfo {

	
	private String userNo;
	
	private String userName;
	
	private int gender;
	
	private String pwd;
	
	private String phoneNo;
	
	private String email;

	private Department depart;
	
	public UserInfo() {
		super();
	}

	public UserInfo(String userNo, String userName, int gender, String phoneNo, String email) {
		super();
		this.userNo = userNo;
		this.userName = userName;
		this.gender = gender;
		this.phoneNo = phoneNo;
		this.email = email;
	}

	/**
	 * @return the userNo
	 */
	public String getUserNo() {
		return userNo;
	}

	/**
	 * @param userNo the userNo to set
	 */
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the gender
	 */
	public int getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(int gender) {
		this.gender = gender;
	}

	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the depart
	 */
	public Department getDepart() {
		return depart;
	}

	/**
	 * @param depart the depart to set
	 */
	public void setDepart(Department depart) {
		this.depart = depart;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserInfo [userNo=" + userNo + ", userName=" + userName + ", gender=" + gender + ", phoneNo=" + phoneNo
				+ ", email=" + email + ", depart=" + depart + "]";
	}
	
}
