package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberValidation {
public static void main(String[] args) {
	String exp="[6789][0-9]{9}";
	String s="9573833757";
	Pattern p=Pattern.compile(exp);
	Matcher m=p.matcher(s);
		if(m.matches()) {
		System.out.println("Valid Mobile Number");
	}else {
		System.out.println("Not Valid mobile Number");
	
	}
}
}
