/*
Class with methods to calculate bits to bytes,
celsius to fahrenheit conversion, calculating
the day number of a given date, converting a time
into different timezones, and calculating the 
calories burned running

Author: Teddy Juntunen
*/

public class ConversionsHelper {

	// Data member. Program will return this
	private int dayCount;

	// Converts bits to bytes
	public double bitsToBytes(int bits) {
		return bits / 8.0;
	}

	// Celsius to fahrenheit temp converter
	public double celsiusToFahrenheit(int tempInCel) {
		return (((tempInCel * 9.0) / 5) + 32);
	}

	// Finds the day number of a given month and day
	public int dayOfYear(int day, String month) {

		int monthCounter;

		/* Calculating day of year with given month and day.
		dayCount is the main variable that keeps track of the day of the year */
		switch(month) {
			case "January": 
			dayCount = day;
			if (day > 31 || day < 1) {
				return - 1;
			}
			break;

			case "February": 
			monthCounter = 1;
			dayCount += numberOfDays(monthCounter) + day;
			if (day > 28 || day < 1) {
				return - 1;
			}
			break;

			case "March": 
			monthCounter = 2;
			dayCount += numberOfDays(monthCounter) + day;
			if (day > 31 || day < 1) {
				return - 1;
			}
			break;

			case "April": 
			monthCounter = 3;
			dayCount += numberOfDays(monthCounter) + day;
			if (day > 30 || day < 1) {
				return - 1;
			}
			break;

			case "May": 
			monthCounter = 4;
			dayCount += numberOfDays(monthCounter) + day;
			if (day > 31 || day < 1) {
				return - 1;
			}
			break;

			case "June": 
			monthCounter = 5;
			dayCount += numberOfDays(monthCounter) + day;
			if (day > 30 || day < 1) {
				return - 1;
			}
			break;

			case "July": 
			monthCounter = 6;
			dayCount += numberOfDays(monthCounter) + day;
			if (day > 31 || day < 1) {
				return - 1;
			}
			break;

			case "August": 
			monthCounter = 7;
			dayCount += numberOfDays(monthCounter) + day;
			if (day > 30 || day < 1) {
				return - 1;
			}
			break;

			case "September": 
			monthCounter = 8;
			dayCount += numberOfDays(monthCounter) + day;
			if (day > 31 || day < 1) {
				return - 1;
			}
			break;

			case "October": 
			monthCounter = 9;
			dayCount += numberOfDays(monthCounter) + day;
			if (day > 30 || day < 1) {
				return - 1;
			}
			break;

			case "November": 
			monthCounter = 10;
			dayCount += numberOfDays(monthCounter) + day;
			if (day > 31 || day < 1) {
				return - 1;
			}
			break;

			case "December": 
			monthCounter = 11;
			dayCount += numberOfDays(monthCounter) + day;
			if (day > 31 || day < 1) {
				return - 1;
			}
			break;

			default: 
			return -1;			
		}

		return dayCount;

	}

	/* counts the number of total days up to the
	month we are calculating in dayOfYear() */
	private int numberOfDays(int monthCounter) {

		// array of all the day numbers of each month in order
		int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 31};
		int result = 0;

		// add all the days up to the month we are using in calculation
		for (int i = 0; i < monthCounter; i++) {
			result += monthDays[i];
		}

		return result;

	}

	// Function that a time from one timezone to another
	public int timeZone(int hour, String fromTZ, String toTZ) {

		// Makes sure that the given time is under 24
		if (hour > 23) {
			System.out.println("Invalid input.");
			return -1;
		}


		/* Set of if statements calculating the timezone
		 depending on the user input */
		if (fromTZ.equals("PST")) {
			if (toTZ.equals("MST")) {
				int result = hour + 1;
				return validateTime(result);

			}
			if (toTZ.equals("CST")) {
				int result = hour + 2;
				return validateTime(result);
			}
			if (toTZ.equals("EST")) {
				int result = hour + 3;
				return validateTime(result);
			} else {
				return -1;
			}
		}
		if (fromTZ.equals("MST")) {
			if (toTZ.equals("PST")) {
				int result = hour - 1;
				return validateTime(result);
			}
			if (toTZ.equals("CST")) {
				int result = hour + 1;
				return validateTime(result);
			}
			if (toTZ.equals("EST")) {
				int result = hour + 2;
				return validateTime(result);
			} else {
				return -1;
			}
		}
		if (fromTZ.equals("CST")) {
			if (toTZ.equals("PST")) {
				int result = hour - 2;
				return validateTime(result);
			}
			if (toTZ.equals("MST")) {
				int result = hour - 1;
				return validateTime(result);
			}
			if (toTZ.equals("EST")) {
				int result = hour + 1;
				return validateTime(result);
			} else {
				return -1;
			}
		}
		if (fromTZ.equals("EST")) {
			if (toTZ.equals("PST")) {
				int result = hour - 3;
				return validateTime(result);
			}
			if (toTZ.equals("MST")) {
				int result = hour - 2;
				return validateTime(result);
			}
			if (toTZ.equals("CST")) {
				int result = hour - 1;
				return validateTime(result);
			} else {
				return -1;
			}
		} else {
			return -1;
		}

	}

	/* Helper function that makes sure the conversion
	is correctly calculated if the calculated time goes onto a
	different day (goes over 23 or under 0) */
	public int validateTime(int time) {
		if (time > 23) {
			return Math.abs(24 - time);
		} else {
			int result = 24 + time;
			if (result != 24) {
				return result;
			} else {
				return 0;
			}
		}
	}

	/* Function that calculates the calories burned while running
	given a weight in pounds and a running duration */
	public double caloriesBurnedRunning(int weightInPounds, int durationInMinutes) {
		double caloriesPerMinute = (0.0175) * (10) * (weightInPounds / 2.2);
		return caloriesPerMinute * durationInMinutes;
	}

}