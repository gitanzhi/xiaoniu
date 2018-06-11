package protocal;

import java.io.Serializable;

public class Result implements Serializable{
	private boolean status;
	
	private String desc;

	public Result() {
		super();
	}

	public Result(boolean status, String desc) {
		super();
		this.status = status;
		this.desc = desc;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Result [status=" + status + ", desc=" + desc + "]";
	}
	
}
