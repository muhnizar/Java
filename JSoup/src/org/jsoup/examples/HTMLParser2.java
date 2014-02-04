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

public class HTMLParser2 {
	
	public static void main(String[] args) {
		 
		Document doc;
		try {
	 
			URL url = new URL("http://google.com");
			Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("172.25.33.77", 3128));
			HttpURLConnection uc = (HttpURLConnection)url.openConnection(proxy);
			uc.connect();
			
			 String line = null;
			    StringBuffer tmp = new StringBuffer();
			    BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
			    while ((line = in.readLine()) != null) {
			      tmp.append(line);
			    }

			  //HTML in Java String , You need to parse the HTML to get at its contents.    
			doc = Jsoup.parse(String.valueOf(tmp));
			//get all images
		
			Elements images = doc.select("img[src~=(?i)\\.(png|jpe?g|gif)]");
			for (Element image : images) {
	 
				System.out.println("\nsrc : " + image.attr("src"));
				System.out.println("height : " + image.attr("height"));
				System.out.println("width : " + image.attr("width"));
				System.out.println("alt : " + image.attr("alt"));
	 
			}
	 
		} catch (IOException e) {
			e.printStackTrace();
		}
	  }
}
