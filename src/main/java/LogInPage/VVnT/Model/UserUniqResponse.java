package LogInPage.VVnT.Model;

public class UserUniqResponse {
	private String dateandtime;
	private String source;
	private String url;
	private String title;
	private String description;
	private String path;
	private String code_snippet;
	private String impact;
	private String success_criteria;
	private String recommendation;
	public UserUniqResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserUniqResponse(String dateandtime, String source, String url, String title, String description,
			String path, String code_snippet, String impact, String success_criteria, String recommendation) {
		super();
		this.dateandtime = dateandtime;
		this.source = source;
		this.url = url;
		this.title = title;
		this.description = description;
		this.path = path;
		this.code_snippet = code_snippet;
		this.impact = impact;
		this.success_criteria = success_criteria;
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

	public String getSuccess_criteria() {
		return success_criteria;
	}

	public void setSuccess_criteria(String success_criteria) {
		this.success_criteria = success_criteria;
	}

	public String getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}

	
}
