package objects;

public class GenericResponse {
	Boolean success;
	String message;
	Object body;

	public GenericResponse(Boolean success, String message, Object body) {
		super();
		this.success = success;
		this.message = message;
		this.body = body;
	}

	public GenericResponse() {
		super();
		success = false;
		message = "No reason provided";
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}

}
