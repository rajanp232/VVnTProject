package LogInPage.VVnT.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_access")
public class UserAccess {
	@Id
	@Column(name = "user_id")
	private String user_id;
	@Column(name = "url")
	private String url;
	@Column(name = "type_of_access")
	private String type_of_access;
	
	
	public UserAccess() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUser_id() {
		return user_id;
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

	public UserAccess(String user_id, String url, String type_of_access) {
		super();
		this.user_id = user_id;
		this.url = url;
		this.type_of_access = type_of_access;
	}
	@Override
	public String toString() {
		return "UserAccess [user_id=" + user_id + ", url=" + url + ", type_of_access=" + type_of_access + "]";
	}

}
