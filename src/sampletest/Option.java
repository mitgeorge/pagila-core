package sampletest;

public class Option {
	private Integer id;
	private String text;
	private Boolean is_correct;
	public Option() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Option(Integer id, String text, Boolean is_correct) {
		super();
		this.id = id;
		this.text = text;
		this.is_correct = is_correct;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Boolean getIs_correct() {
		return is_correct;
	}
	public void setIs_correct(Boolean is_correct) {
		this.is_correct = is_correct;
	}

}
