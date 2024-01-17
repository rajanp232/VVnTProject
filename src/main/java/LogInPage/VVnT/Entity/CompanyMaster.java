package LogInPage.VVnT.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "company_master")
public class CompanyMaster {
	
	@Id
	@Column(name = "company_code")
	private int company_code;
	@Column(name = "company_name")
	private String company_name;
	@Column(name = "address")
	private String address;
	@Column(name = "primary_contact_number")
	private int primary_contact_number;

	public CompanyMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompanyMaster(int company_code, String company_name, String address, int primary_contact_number) {
		super();
		this.company_code = company_code;
		this.company_name = company_name;
		this.address = address;
		this.primary_contact_number = primary_contact_number;
	}

	public int getCompany_code() {
		return company_code;
	}

	public void setCompany_code(int company_code) {
		this.company_code = company_code;
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
	@Override
	public String toString() {
		return "CompanyMaster [company_code=" + company_code + ", company_name=" + company_name + ", address=" + address
				+ ", primary_contact_number=" + primary_contact_number + "]";
	}

}
