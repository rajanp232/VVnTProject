package LogInPage.VVnT.Model;

public class UserUniqRequest {
	private String dateandtime;
	private String source;
	private String url;
	private String title;
	private String description;
	private String path;
	private String code_snippet;
	private String impact;
	private String succes_criteria;
	private String recommendation;

	public UserUniqRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserUniqRequest(String dateandtime, String source, String url, String title, String description, String path,
			String code_snippet, String impact, String succes_criteria, String recommendation) {
		super();
		this.dateandtime = dateandtime;
		this.source = source;
		this.url = url;
		this.title = title;
		this.description = description;
		this.path = path;
		this.code_snippet = code_snippet;
		this.impact = impact;
		this.succes_criteria = succes_criteria;
		this.recommendation = recommendation;
	}

	public String getDateandtime() {
		return dateandtime;
	}

	public void setDateandtime(String dateandtime) {
		this.dateandtime = dateandtime;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getCode_snippet() {
		return code_snippet;
	}

	public void setCode_snippet(String code_snippet) {
		this.code_snippet = code_snippet;
	}

	public String getImpact() {
		return impact;
	}

	public void setImpact(String impact) {
		this.impact = impact;
	}

	public String getSucces_criteria() {
		return succes_criteria;
	}

	public void setSucces_criteria(String succes_criteria) {
		this.succes_criteria = succes_criteria;
	}

	public String getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}

}
