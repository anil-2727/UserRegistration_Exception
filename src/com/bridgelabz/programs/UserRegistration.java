package com.bridgelabz.programs;

	  
	import java.util.Scanner;
	import java.util.regex.*;

	public class UserRegistration {

	    public boolean firstNameValidation(String firstName) {
	        return Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", firstName);
	    }

	    public boolean lastNameValidation(String firstName) {
	        return Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", firstName);
	    }

	    public boolean emailValidation(String email) {
	        return Pattern.matches("^[a-zA-Z0-9-.+]+@[a-zA-Z0-9.]+$", email);
	    }

	    public boolean mobileValidation(String phone) {
	        return Pattern.matches("^[0-9]{3} [0-9]{10}$", phone);
	    }

	    public boolean passwordVal(String password) {
	        return Pattern.matches("(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$", password);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        UserRegistration person = new UserRegistration();
	        String password = scanner.nextLine();

	        System.out.println(person.passwordVal(password));
	        System.out.println("Welcome to User Registration");

	        System.out.println("Valid Emails :");
	        System.out.println(person.emailValidation("abc@yahoo.com"));
	        System.out.println(person.emailValidation("abc-100@yahoo.com"));
	        System.out.println(person.emailValidation("abc111@abc.com"));
	        System.out.println(person.emailValidation("abc-100@abc.net"));
	        System.out.println(person.emailValidation("abc.100@abc.com.au"));
	        System.out.println(person.emailValidation("abc@1.com"));
	        System.out.println(person.emailValidation("abc@gmail.com.com"));
	        System.out.println(person.emailValidation("abc+100@gmail.com"));
	    }
	}

