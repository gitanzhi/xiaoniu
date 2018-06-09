package cn.edu360.day04;

public class MovieAvgBean {
	
	private String movie;
	
	private Double avg;

	public MovieAvgBean() {
		super();
	}

	public MovieAvgBean(String movie, Double avg) {
		super();
		this.movie = movie;
		this.avg = avg;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public Double getAvg() {
		return avg;
	}

	public void setAvg(Double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "MovieAvgBean [movie=" + movie + ", avg=" + avg + "]";
	}
	
	
}
