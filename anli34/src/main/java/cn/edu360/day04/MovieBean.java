package cn.edu360.day04;

public class MovieBean {
	
	private String movie;
	
	private String rate;
	
	private String timeStamp;
	
	private String uid;

	public MovieBean() {
		super();
	}

	public MovieBean(String movie, String rate, String timeStamp, String uid) {
		super();
		this.movie = movie;
		this.rate = rate;
		this.timeStamp = timeStamp;
		this.uid = uid;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "MovieBean [movie=" + movie + ", rate=" + rate + ", timeStamp=" + timeStamp + ", uid=" + uid + "]";
	}
	
	
}
