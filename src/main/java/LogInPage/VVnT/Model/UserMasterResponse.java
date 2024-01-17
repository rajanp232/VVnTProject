package LogInPage.VVnT.Model;

public class UserMasterResponse {
	private int company_code;
	private int user_id;
	private String password;
	private String email_id;
	private String contact_deatils;
	private String type_of_user;

	public UserMasterResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public String getContact_deatils() {
		return contact_deatils;
	}

	public void setContact_deatils(String contact_deatils) {
		this.contact_deatils = contact_deatils;
	}

	public String getType_of_user() {
		return type_of_user;
	}

	public void setType_of_user(String type_of_user) {
		this.type_of_user = type_of_user;
	}

}
