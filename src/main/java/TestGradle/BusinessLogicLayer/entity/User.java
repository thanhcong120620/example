package TestGradle.BusinessLogicLayer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User extends BaseEntity {
	
	@Column(name="user_name")
	private String userName; 
	
	@Column(name="password")
	private String password; 
	
	@Column(name="roleuser")
	private String roleUser;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@Column(name="full_name")
	private String fullName; 
	
	@Column(name="genderuser")
	private String genderUser;
	
	@Column(name="birthday")
	private String birthDay;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="addressuser")
	private String addressUser;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoleUser() {
		return roleUser;
	}

	public void setRoleUser(String roleUser) {
		this.roleUser = roleUser;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGenderUser() {
		return genderUser;
	}

	public void setGenderUser(String genderUser) {
		this.genderUser = genderUser;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddressUser() {
		return addressUser;
	}

	public void setAddressUser(String addressUser) {
		this.addressUser = addressUser;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", roleUser=" + roleUser + ", isActive="
				+ isActive + ", fullName=" + fullName + ", genderUser=" + genderUser + ", birthDay=" + birthDay
				+ ", phone=" + phone + ", addressUser=" + addressUser + "]";
	}

	
	
	
}
