    package com.regex;

	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class PasswordValid {
	public static void main(String[] args) {
		String exp="(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$><]).{6,8}";
		String s="Gura";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
			if(m.matches()) {
			System.out.println("Valid PassWord ");
		}else {
			System.out.println("Not Valid PassWord");
		
		}
	}
	}


