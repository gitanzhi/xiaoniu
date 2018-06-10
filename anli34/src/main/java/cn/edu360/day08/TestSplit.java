package cn.edu360.day08;

public class TestSplit {
	public static void main(String[] args) {
		String line = "jobName=高级Java 软件工程师, comName=北京必可测科技股份有限公司, addr=北京, salary=0.8-3万/月, date=06-07";
		String[] split = line.split(",");
		String jobName = split[0];
		String comName = split[1];
		String addr = split[2];
		String salary = split[3];
		String date = split[4];
		System.out.println(addr);
	}
}
