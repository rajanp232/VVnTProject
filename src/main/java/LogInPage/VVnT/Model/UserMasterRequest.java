package LogInPage.VVnT.Model;

import jakarta.validation.constraints.NotNull;

public class UserMasterRequest {
	private int company_code;
	private int user_id;
	private String password;
	private String email_id;
	private String contact_details;
	private String type_of_users;
	public int getCompany_code() {
		return company_code;
	}
	public void setCompany_code(int company_code) {
		this.company_code = company_code;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
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
	public UserMasterRequest(int company_code, int user_id, String password, String email_id, String contact_details,
			String type_of_users) {
		super();
		this.company_code = company_code;
		this.user_id = user_id;
		this.password = password;
		this.email_id = email_id;
		this.contact_details = contact_details;
		this.type_of_users = type_of_users;
	}
	public UserMasterRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
}