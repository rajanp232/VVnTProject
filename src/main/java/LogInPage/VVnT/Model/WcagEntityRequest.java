package LogInPage.VVnT.Model;

public class WcagEntityRequest {

	private int ID;
	private String Category;
	private String Guidline;
	private String Level;
	private String Principle;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getGuidline() {
		return Guidline;
	}
	public void setGuidline(String guidline) {
		Guidline = guidline;
	}
	public String getLevel() {
		return Level;
	}
	public void setLevel(String level) {
		Level = level;
	}
	public String getPrinciple() {
		return Principle;
	}
	public void setPrinciple(String principle) {
		Principle = principle;
	}
	public WcagEntityRequest(int iD, String category, String guidline, String level, String principle) {
		super();
		ID = iD;
		Category = category;
		Guidline = guidline;
		Level = level;
		Principle = principle;
	}
	public WcagEntityRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
