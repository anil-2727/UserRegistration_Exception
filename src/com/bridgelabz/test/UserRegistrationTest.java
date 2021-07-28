package com.bridgelabz.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import com.bridgelabz.programs.UserRegistration;
import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {
	UserRegistration userObj = new UserRegistration();

	@Test
	void firstNameTest() throws InvalidFirstNameTestException {
		try {

			boolean check = userObj.firstNameValidation("en");
			if (check) {
				assertTrue(check);

			} else
				throw new InvalidFirstNameTestException("Enter Correct First Name");
		} catch (InvalidFirstNameTestException e) {
			e.printStackTrace();
		}
	}

	@Test
	void lastNameTest() throws InvalidLastNameTestException {
		try {
			boolean checkLastName = userObj.lastNameValidation("tekar");
			if (checkLastName) {
				assertTrue(checkLastName);
			} else
				throw new InvalidLastNameTestException("Enter Correct Last Name");
		} catch (InvalidLastNameTestException e) {
			e.printStackTrace();
		}
	}

	@Test
	void emailValidationTest() throws InvalidEmailTestExceptin {
		try {
			boolean check = userObj.emailValidation("tekargmail.com");
			if (check) {
				assertTrue(check);
			} else
				throw new InvalidEmailTestExceptin("Enter Correct Email");
		} catch (InvalidEmailTestExceptin e) {
			e.printStackTrace();
		}
	}

	@Test
	void mobileValidationTest() throws InvalidPhoneNumberException {
		try {
			boolean check = userObj.mobileValidation("091 96f43210");
			if (check) {
				assertTrue(check);
			} else {
				throw new InvalidPhoneNumberException("Enter Valid Number");
			}
		} catch (InvalidPhoneNumberException e) {
			e.printStackTrace();
		}
	}

	@ParameterizedTest
	@ValueSource(strings = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
			"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com.com" })
	void emailValidationTest(String email) {
		assertTrue(userObj.emailValidation(email));
	}

	@Test
	void passwordValTest() throws InvalidpasswordValTestException {
		try {
			boolean check = userObj.passwordVal("bc1234");
			if (check) {
				assertTrue(check);
			} else {
				throw new InvalidpasswordValTestException("Invalid Password");
			}
		} catch (InvalidpasswordValTestException e) {
			e.printStackTrace();
		}
	}
}

class InvalidPhoneNumberException extends Exception {
	InvalidPhoneNumberException(String s) {
		super("Enter correct phone number");
	}
}

class InvalidpasswordValTestException extends Exception {
	InvalidpasswordValTestException(String s) {
		super("Enter correct password");
	}
}

class InvalidFirstNameTestException extends Exception {
	InvalidFirstNameTestException(String name) {
		super(name);
	}
}

class InvalidLastNameTestException extends Exception {
	InvalidLastNameTestException(String name) {
		super(name);
	}
}

class InvalidEmailTestExceptin extends Exception {
	InvalidEmailTestExceptin(String email) {
		super(email);
	}
}
