package LogInPage.VVnT.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="Wcag_guidelines")
public class WCAG_Guidelines {
	@Id
	@Column(name="ID")
	private int id;
	
//	private int ID;
	@Column(name="category")
	private String category;
	@Column(name="guideline")
	private String guideline;
	@Column(name="level")
	private String level;
	@Column(name="principle")
	private String principle;
	
	public WCAG_Guidelines() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WCAG_Guidelines(int iD, String category, String guideline, String level, String principle) {
		super();
		id = iD;
		this.category = category;
		this.guideline = guideline;
		this.level = level;
		this.principle = principle;
	}
	public int getID() {
		return id;
	}
	public void setID(int iD) {
		id = iD;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getGuideline() {
		return guideline;
	}
	public void setGuideline(String guideline) {
		this.guideline = guideline;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getPrinciple() {
		return principle;
	}
	public void setPrinciple(String principle) {
		this.principle = principle;
	}
	
	
	

}
