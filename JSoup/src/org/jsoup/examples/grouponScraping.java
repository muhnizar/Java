package org.jsoup.examples;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class grouponScraping {

	public static void main(String[] args) throws SQLException, IOException {
		processPage("http://www.groupon.com.pe/descuentos/local/belleza-y-spa");
		//http://www.groupon.com/browse/chicago?category=health-and-fitness
		
	}
	
	public static void processPage(String URL) throws SQLException, IOException{
 
	
			//get useful information
			Document doc = Jsoup.connect(URL).get();
			System.out.println(doc);
			Elements links = doc.body().select("div#boxContent");
			//System.out.println(doc.body().select("div#boxContent"));
			int i=0;
			
			for(Element link: links){
				i++;
				System.out.println(link.select("div.show_deal"));	
			}
			
			System.out.println(">>>>>>>>>>>>>>>>total : " +i +"<<<<<<<<<<<<<<<<<<<<<<<<<<");
 
			//get all links and recursively call the processPage method
			/*Elements links = doc.select("a[href]");
			for(Element link: links){
				System.out.println(link);
			}*/
		}
	}
	
