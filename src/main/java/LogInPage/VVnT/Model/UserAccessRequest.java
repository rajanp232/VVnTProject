package LogInPage.VVnT.Model;

public class UserAccessRequest {
	private String user_id;
	private String url;
	private String type_of_access;

	public String getUser_id() {
		return user_id;
	}

	public UserAccessRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserAccessRequest(String user_id, String url, String type_of_access) {
		super();
		this.user_id = user_id;
		this.url = url;
		this.type_of_access = type_of_access;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getType_of_access() {
		return type_of_access;
	}

	public void setType_of_access(String type_of_access) {
		this.type_of_access = type_of_access;
	}
}
