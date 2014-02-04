package org.jsoup.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HTMLParser1 {
	
	public static void main(String[] args) {
		 
		Document doc;
		
		try {
	 
			// get the source of HTML through Proxy
			System.setProperty("http.proxyHost", "172.25.33.77");
			System.setProperty("http.proxyPort", "3128");
			
 
			// need http protocol
			doc = Jsoup.connect("http://google.com").get();
	 
			// get page title
			String title = doc.title();
			System.out.println("title : " + title);
	 
			// get all links
			Elements links = doc.select("a[href]");
			for (Element link : links) {
	 
				// get the value from href attribute
				System.out.println("\nlink : " + link.attr("href"));
				System.out.println("text : " + link.text());
	 
			}
	 
		} catch (IOException e) {
			e.printStackTrace();
		}
	 
	  }
}
