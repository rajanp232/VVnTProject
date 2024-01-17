package LogInPage.VVnT.Model;

public class CompanyMasterResponse {
	private int company_code;
	private String company_name;
	private String address;
	private int primary_contact_number;

	public int getCompany_code() {
		return company_code;
	}

	public void setCompany_code(int company_code) {
		this.company_code = company_code;
	}

	public CompanyMasterResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompanyMasterResponse(int company_code, String company_name, String address, int primary_contact_number) {
		super();
		this.company_code = company_code;
		this.company_name = company_name;
		this.address = address;
		this.primary_contact_number = primary_contact_number;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPrimary_contact_number() {
		return primary_contact_number;
	}

	public void setPrimary_contact_number(int primary_contact_number) {
		this.primary_contact_number = primary_contact_number;
	}

}
