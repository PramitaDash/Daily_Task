package com.java.excep;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main8 {
	public static void main(String args[]) throws ParseException {
	    String date = "2021-11-10";

	    //Specifying the wrong format of the date
	    DateFormat format = new SimpleDateFormat("234234");
	    
	    //Trying to parse the date into the wrong format
	    System.out.println(format.parse(date));
	  }

}
