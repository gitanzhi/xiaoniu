package cn.edu360.day08;

public class JobBean {
	
	private String jobName;
	
	private String comName;
	
	private String addr;
	
	private String salary;
	
	private String date;

	public JobBean() {
		super();
	}

	public JobBean(String jobName, String comName, String addr, String salary, String date) {
		super();
		this.jobName = jobName;
		this.comName = comName;
		this.addr = addr;
		this.salary = salary;
		this.date = date;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "jobName:" + jobName + ", comName:" + comName + ", addr:" + addr + ", salary:" + salary
				+ ", date:" + date;
	}
	
	
}
