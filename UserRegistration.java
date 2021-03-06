package com.user.registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationSystem {

	static Scanner sc = new Scanner(System.in);

	public static void firstName() {

		System.out.println("Enter The First Name Please Make Sure Name Should be Star From Capital Letter And Minimum 3 Character");
		String fName = sc.next();
		String regex = "[A-Z]{1}[a-z]{2,}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(fName);
		System.out.println("String Result Is :" + m.matches());
		boolean check = (m.matches());
		if (check == true) {
			System.out.println("First Name Is Valid");
		} else {
			System.out.println("First Name Is Invalid");
		}
	}

	public static void lastName() {

		System.out.println("Enter The Last Name Please Make Sure Name Should be Star From Capital Letter And Minimum 3 Character");
		String lName = sc.next();
		String regex = "[A-Z]{1}[a-z]{2,}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lName);
		System.out.println("String Result Is:" + m.matches());
		boolean check = (m.matches());
		if (check == true) {
			System.out.println("Last Name Is Valid");
		} else {
			System.out.println("Last Name Is Invalid");
		}
	}

	public static void email() {

		System.out.println("Enter The Valid Email Id");
		String email = sc.next();
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		System.out.println("String Result Is :" + m.matches());
		boolean check = (m.matches());
		if (check == true) {
			System.out.println("Email Id Is Valid");
		} else {
			System.out.println("Email Is Invalid");
		}

	}

	public static void phoneNumber() {

		System.out.println("Enter The Valid Phone Number Please Make Sure Number Should Start From 91 Code");
		String phoneNumber = sc.next();
		String regex = "91?[0-9]{9}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(phoneNumber);
		System.out.println("String Result Is :" + m.matches());
		boolean check = (m.matches());
		if (check == true) {
			System.out.println("Number Is Valid");
		} else {
			System.out.println("Number IS Invalid");
		}

	}

	public static void password() {

		System.out.println("Please Enter The Valid Password using Rules");
		System.out.println("RULE 1: Minimum 8 Characters ");
		System.out.println("RULE 2: Should Have At Least 1 Upper Case");
		System.out.println("RULE 3: Should Have At Least 1 Numeric Number");
		System.out.println("RULE 4: Should Have At Least 1 Special Character");
		String password = sc.next();
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#&$])(?=\\S+$).{8,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		System.out.println("String Result Is :" + m.matches());
		boolean check = m.matches();

		if (check == true) {
			System.out.println("Password Is Valid");
		} else {
			System.out.println("Password Is invalid");
		}
	}

	public static void main(String args[]) {

		firstName();
		lastName();
		email();
		phoneNumber();
		password();
	}
}
