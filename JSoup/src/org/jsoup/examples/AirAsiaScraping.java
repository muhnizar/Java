package org.jsoup.examples;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class AirAsiaScraping {

	public static void main(String[] args) {
	
	Document doc;
		
	try {
	 
		//System.setProperty("http.proxyHost", "172.25.36.56");
		//System.setProperty("http.proxyPort", "5566");
		
				
		//doc = Jsoup.connect("http://www.qatar.cmu.edu/faculty/directory_search/").data("searchterms", "john").data("sort", "asc").data("category", "all").post();
		 
		doc = 	// Jsoup.connect("http://booking.airasia.com/Select.aspx/")
				Jsoup.connect("http://booking.airasia.com/Search.aspx")
					
				.data("ControlGroupAvailabilitySearchInputSelectView$AvailabilitySearchInputSelectView$DropDownListMarketDay1","8")
				.data("ControlGroupAvailabilitySearchInputSelectView$AvailabilitySearchInputSelectView$DropDownListMarketDay2","15")
				.data("ControlGroupAvailabilitySearchInputSelectView$AvailabilitySearchInputSelectView$DropDownListMarketMonth1","2014-01")
				.data("ControlGroupAvailabilitySearchInputSelectView$AvailabilitySearchInputSelectView$DropDownListMarketMonth2","2014-01")
				.data("ControlGroupAvailabilitySearchInputSelectView$AvailabilitySearchInputSelectView$DropDownListPassengerType_ADT","1")
				.data("ControlGroupAvailabilitySearchInputSelectView$AvailabilitySearchInputSelectView$DropDownListPassengerType_CHD","0")
				.data("ControlGroupAvailabilitySearchInputSelectView$AvailabilitySearchInputSelectView$DropDownListPassengerType_INFANT","0")
				.data("ControlGroupAvailabilitySearchInputSelectView$AvailabilitySearchInputSelectView$DropDownListSearchBy","columnView")
				.data("ControlGroupAvailabilitySearchInputSelectView$AvailabilitySearchInputSelectView$RadioButtonMarketStructure","RoundTrip")
				.data("ControlGroupAvailabilitySearchInputSelectView$AvailabilitySearchInputSelectView$TextBoxMarketDestination1","CGK")
				.data("ControlGroupAvailabilitySearchInputSelectView$AvailabilitySearchInputSelectView$TextBoxMarketOrigin1","MEL")
				.data("ControlGroupAvailabilitySearchInputSelectView$ButtonSubmit","Search")
				.data("ControlGroupAvailabilitySearchInputSelectView$MultiCurrencyConversionViewSelectView$DropDownListCurrency","5027457818")
				.data("ControlGroupAvailabilitySearchInputSelectView_AvailabilitySearchInputSelectViewdestinationStation1","CGK")
				.data("ControlGroupAvailabilitySearchInputSelectView_AvailabilitySearchInputSelectVieworiginStation1","MEL")
				/*.data("MemberLoginSelectView$HFTimeZone","420")
				.data("__VIEWSTATE","/wEPDwUBMGRktapVDbdzjtpmxtfJuRZPDMU9XYk=")
				.data("__EVENTARGUMENT" , "")
				.data("__EVENTTARGET" ,"")
				*/
				 .post();
		
		System.out.println(doc);
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
