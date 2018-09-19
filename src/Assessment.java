
public class Assessment {
	
	private Integer id;
	private String title;
	private String image;
	private String duration;
	private String startDate;
	private String endDate;
	public Assessment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Assessment(String title, String image, String duration, String startDate, String endDate) {
		super();
		this.title = title;
		this.image = image;
		this.duration = duration;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	

}
