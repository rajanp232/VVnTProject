package LogInPage.VVnT.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lighthouseaudits")
public class UserEntity {
	@Id
	private int id;
	@Column(name = "executiondate")
	private String executiondate;

	@Column(name = "source")
	private String source;

	@Column(name = "url")
	private String url;

	@Column(name = "score_display_mode")
	private String score_display_mode;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "path")
	private String path;

	@Column(name = "code_snippet")
	private String codeSnippet;

	@Column(name = "impact")
	private String impact;

	@Column(name = "recommendation")
	private String recommendation;

	// Getters and setters, other methods...

	// Constructors, getters, setters, and other annotations as needed

	// Example constructor:
	public UserEntity() {
		// Default constructor
	}

	public UserEntity(int id, String executiondate, String source, String url, String score_display_mode, String title,
			String description, String path, String codeSnippet, String impact, String recommendation) {
		super();
		this.id = id;
		this.executiondate = executiondate;
		this.source = source;
		this.url = url;
		this.score_display_mode = score_display_mode;
		this.title = title;
		this.description = description;
		this.path = path;
		this.codeSnippet = codeSnippet;
		this.impact = impact;
		this.recommendation = recommendation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExecutiondate() {
		return executiondate;
	}

	public void setExecutiondate(String executiondate) {
		this.executiondate = executiondate;
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

	public String getScore_display_mode() {
		return score_display_mode;
	}

	public void setScore_display_mode(String score_display_mode) {
		this.score_display_mode = score_display_mode;
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

	public String getCodeSnippet() {
		return codeSnippet;
	}

	public void setCodeSnippet(String codeSnippet) {
		this.codeSnippet = codeSnippet;
	}

	public String getImpact() {
		return impact;
	}

	public void setImpact(String impact) {
		this.impact = impact;
	}

	public String getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", executiondate=" + executiondate + ", source=" + source + ", url=" + url
				+ ", score_display_mode=" + score_display_mode + ", title=" + title + ", description=" + description
				+ ", path=" + path + ", codeSnippet=" + codeSnippet + ", impact=" + impact + ", recommendation="
				+ recommendation + "]";
	}


}
