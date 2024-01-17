package LogInPage.VVnT.Entity;

import javax.validation.Valid;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "user_master")
public class UserMaster {
	@Id
	@Column(name = "user_id")
	@NotNull(message="Description can't be null or empty")
	private int user_id;

	@Column(name = "company_code")
	private int company_code;

	@Column(name = "password")
	@NotNull(message="Description can't be null or empty")
	private String password;

	@Column(name = "email_id")
	private String email_id;
	@Column(name = "contact_details")
	private String contact_details;
	@Column(name = "type_of_users")
	private String type_of_users;

	public UserMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserMaster(int user_id, int company_code, String password, String email_id, String contact_details,
			String type_of_users) {
		super();
		this.user_id = user_id;
		this.company_code = company_code;
		this.password = password;
		this.email_id = email_id;
		this.contact_details = contact_details;
		this.type_of_users = type_of_users;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getCompany_code() {
		return company_code;
	}

	public void setCompany_code(int company_code) {
		this.company_code = company_code;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getContact_details() {
		return contact_details;
	}

	public void setContact_details(String contact_details) {
		this.contact_details = contact_details;
	}

	public String getType_of_users() {
		return type_of_users;
	}

	public void setType_of_users(String type_of_users) {
		this.type_of_users = type_of_users;
	}

	@Override
	public String toString() {
		return "UserMaster [user_id=" + user_id + ", company_code=" + company_code + ", password=" + password
				+ ", email_id=" + email_id + ", contact_details=" + contact_details + ", type_of_users=" + type_of_users
				+ "]";
	}

}
