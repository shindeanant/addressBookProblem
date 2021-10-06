package com.bridgelabzz.bookaddress;

import java.util.Arrays;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NewContact {

	private static final Logger LOG = LogManager.getLogger("BookAddress.class");

	Integer[] phoneNumber = new Integer[10];
	String[] Address = new String[10];
	String[] Firstname = new String[10];
	String[] Lastname = new String[10];

	public void getValue(int phonenumber, String address, String firstname, String lastname, int length, int time) {
		int count = 0;

		for (int i = time; i < length; i++) {
			phoneNumber[i] = phonenumber;
			Address[i] = address;
			Firstname[i] = firstname;
			Lastname[i] = lastname;
			// count=count+1;
		}

		LOG.info("phoneNumber" + Arrays.toString(phoneNumber));
		LOG.info("Address" + Arrays.toString(Address));
		LOG.info("Firstname" + Arrays.toString(Firstname));
		LOG.info("Lastname" + Arrays.toString(Lastname));

	}

}

class BookAddress extends NewContact {

	private static final Logger LOG = LogManager.getLogger("BookAddress.class");
	private static final String NULL = null;

	public static void main(String[] args) {

		LOG.info("Welcome to address Book Program");

		Scanner value = new Scanner(System.in);

		BookAddress contact = new BookAddress();

		// LOG.info("1.ADD 2.REPLACE 3.DELETE");
		// 1LOG.info("enter Your Choice");
		int Check = value.nextInt();
		int choice;
		do {
			LOG.info("Press 1 for ADD, press 2 for REPLACE and press 3 for DELETE");

			LOG.info("Enter Your Choice: ");

			Check = value.nextInt();
			switch (Check) {
			case 1:
				LOG.info("Enter the number of contact you want to add:");
				int length = value.nextInt();
				for (int i = 0; i < length; i++) {
					LOG.info("Enter the phonenumber");
					int phonenumber = value.nextInt();

					LOG.info("Enter the address");
					String address = value.nextLine();

					LOG.info("Enter the firstname");
					String firstname = value.nextLine();

					LOG.info("Enter the lastname");
					String lastname = value.nextLine();

					int time = i;
					contact.getValue(phonenumber, address, firstname, lastname, length, time);
				}
				// contact.getValue(phonenumber,address,firstname,lastname);
				break;

			}
			LOG.info("Do you want to continue Then press 1 for yes and press 2 for No");
			choice = value.nextInt();
		} while (choice == 1);

	}

}
