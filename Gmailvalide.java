package com.regex;
	import java.util.regex.*;
	import java.util.regex.Pattern;

	public class Gmailvalide {
	public static void main(String[] args) {
		String exp="[A-Z][a-z 0-9]+@[a-z]mail+[.]com";
		String s="Gurava@gmail.comLucky123@123.com";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
			while(m.find()){
				System.out.println(m.group());
			}
	}

}
