package cn.edu360.day08;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TestJsoup {
	public static void main(String[] args) throws Exception {
		Document document = getDocumentByUrl();
		//System.out.println(document);
		//getElements(document);
		//getElementsByC(document);
		//getValue(document);
	}
	
	public static void getValue(Document document){
		Elements select = document.select("#resultList .el a");
		for (Element element : select) {
//			System.out.println(element.text());//标签中间的值
			System.out.println(element.attr("href"));
		}
	}
	
	/**
	 * 父子和兄弟标签
	 * @param document
	 */
	public static void getElementsByC(Document document){
		Elements select = document.select("#resultList .el span");
		for (Element element : select) {
			//System.out.println(element);
			Elements children = element.children();
			Element parent = element.parent();
			element.siblingElements();//兄弟标签
			element.nextSibling();//后边
			element.previousSibling();//前边
			for (Element element2 : children) {
				System.out.println(element2);
			}
		}
	}
	
	/**
	 * 查找具体数据的三种方式
	 * 1.通过id查找数据
	 * 2.通过class查找数据
	 * 3.通过标签查找数据tag
	 * 
	 * select里边直接传递就是上面的三种形式
	 * @param document
	 */
	public static void getElements(Document document) {
		//Id是唯一的
		Element elementById = document.getElementById("resultList");
		//System.out.println(elementById);
		
		Elements elementsByClass = document.getElementsByClass("el");
		/*for (Element element : elementsByClass) {
			System.out.println(element);
			System.out.println("----------------");
		}*/
		
		Elements elementsByTag = document.getElementsByTag("span");
		/*for (Element element : elementsByTag) {
			System.out.println(element);
			System.out.println("----------");
		}*/
		
		Elements select = document.select("#resultList .el");
		for (Element element : select) {
			System.out.println(element);
			System.out.println("------");
		}
	}

	/**
	 * @return
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	private static Document getDocumentByUrl() throws MalformedURLException, IOException {
		URL url = new URL("https://search.51job.com/list/071800%252C010000,000000,0000,00,9,99,%25E5%25A4%25A7%25E6%2595%25B0%25E6%258D%25AE,2,1.html?lang=c&stype=&postchannel=0000&workyear=99&cotype=99&degreefrom=99&jobterm=99&companysize=99&providesalary=99&lonlat=0%2C0&radius=-1&ord_field=0&confirmdate=9&fromType=&dibiaoid=0&address=&line=&specialarea=00&from=&welfare=");
		Document document = Jsoup.parse(url, 2000);
		return document;
	}
}
