package cn.edu360.day08;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Job {
	
	public static void main(String[] args) throws Exception {
		String url = "https://search.51job.com/list/010000,000000,0000,00,9,99,%25E5%25A4%25A7%25E6%2595%25B0%25E6%258D%25AE,2,1.html?lang=c&stype=&postchannel=0000&workyear=99&cotype=99&degreefrom=99&jobterm=99&companysize=99&providesalary=99&lonlat=0%2C0&radius=-1&ord_field=0&confirmdate=9&fromType=&dibiaoid=0&address=&line=&specialarea=00&from=&welfare=";
		
		testMyMethod(url);		
	}

	/**
	 * @param url
	 * @throws Exception 
	 */
	private static void testMyMethod(String url) throws Exception {
		long start = System.currentTimeMillis();
		int sum = 1;
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\java\\data\\day08result.txt") {
		});
		while(true){
			Document document = getDocumentByUrl(url);
			PageBean page = new PageBean();
			page.setDocument(document);
			List<JobBean> jobsByPage = getJobsByPage(page);
			for (JobBean jobBean : jobsByPage) {
				bw.write(jobBean.toString());
				bw.newLine();
				bw.flush();
			}
			sum++;
			System.out.println("-------------"+sum+"------------");
			getNextPageUrl(page);
			if(page.getHasNextPage()){
				url = page.getNextPageUrl();
			}else{
				break;
			}
		}
		bw.close();
		long end = System.currentTimeMillis();
		System.out.println(end-start);//46690 41951 42430 44591
	}
	
	/**
	 * 获取下一页
	 * @param page
	 */
	public static void getNextPageUrl(PageBean page){
		Document document = page.getDocument();
		//如果有下一页可以得到下一页
		Elements select = document.select(".dw_page .bk").get(1).select("a");
		if(select!=null&&select.size()>0){
			String url = select.get(0).attr("href");
			page.setNextPageUrl(url);
			page.setHasNextPage(true);
		}else{
			page.setHasNextPage(false);
		}
	}
		
	/**
	 * 通过当前页获取所以信息
	 * <div class="el"> 
		 <p class="t1 "> <em class="check" name="delivery_em" onclick="checkboxClick(this)"></em> <input class="checkbox" type="checkbox" name="delivery_jobid" value="103096962" jt="0" style="display:none"> <span> <a target="_blank" title="分析师（大数据研究方向）" href="https://jobs.51job.com/beijing-ftq/103096962.html?s=01&amp;t=0" onmousedown=""> 分析师（大数据研究方向） </a> </span> </p> 
		 <span class="t2"><a target="_blank" title="房天下" href="https://jobs.51job.com/all/co2174595.html">房天下</a></span> 
		 <span class="t3">北京-丰台区</span> 
		 <span class="t4">1-2万/月</span> 
		 <span class="t5">06-09</span> 
		</div>
	 * @param page
	 * @return
	 */
	public static List<JobBean> getJobsByPage(PageBean page) {
		ArrayList<JobBean> list = new ArrayList<>();
		Document document = page.getDocument();
		Elements select = document.select("#resultList .el");
		select.remove(0);
		for (Element element : select) {
			String jobName = element.select(".t1 a").text();
			String comName = element.select(".t2 a").attr("title");
			String addr = element.select(".t3").text();
			String salary = element.select(".t4").text();
			String date = element.select(".t5").text();
			JobBean jobBean = new JobBean(jobName, comName, addr, salary, date);
			list.add(jobBean);
		}
		return list;
	}
	
	public static Document getDocumentByUrl(String url) {
		URL u;
		try {
			u = new URL(url);
			Document document = Jsoup.parse(u, 4000);
			return document;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
