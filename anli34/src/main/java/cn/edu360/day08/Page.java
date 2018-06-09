package cn.edu360.day08;

import org.jsoup.nodes.Document;

public class Page {
	private Document document;
	
	private String nextPageUrl;
	
	private Boolean hasNextPage;

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public String getNextPageUrl() {
		return nextPageUrl;
	}

	public void setNextPageUrl(String nextPageUrl) {
		this.nextPageUrl = nextPageUrl;
	}

	public Boolean getHasNextPage() {
		return hasNextPage;
	}

	public void setHasNextPage(Boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}

	@Override
	public String toString() {
		return "Page [document=" + document + ", nextPageUrl=" + nextPageUrl + ", hasNextPage=" + hasNextPage + "]";
	}
	
	
}
