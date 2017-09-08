/*
Class that runs the conversions

Author: Teddy Juntunen
*/

import java.util.Scanner;

public class ConversionsDriver {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ConversionsHelper conversionHelper = new ConversionsHelper();
		
		// prompting user for number of bits to convert to bytes
		System.out.print("Number of bits to convert to bytes: ");
		int bits = scan.nextInt();
		System.out.println(conversionHelper.bitsToBytes(bits) + " bytes");

		// prompting user for celsius temperature to convert to fahrenheit
		System.out.print("Celsius temperature to convert to fahrenheit: ");
		int temperature = scan.nextInt();
		System.out.println(conversionHelper.celsiusToFahrenheit(temperature) + " degrees Fahrenheit");

		// prmompting the user for a month and a day
		System.out.print("Enter a day: ");
		int day = scan.nextInt();
		System.out.print("Enter a month: ");
		String month = scan.next();
		if (conversionHelper.dayOfYear(day, month) == -1) {
			System.out.println("You entered an invalid day or month.");
		} else {
			System.out.println(conversionHelper.dayOfYear(day, month) + " is the day number");
		}

		// Gets the user input to convert the timezone
		System.out.print("Enter the HOUR to convert to a different timezone: ");
		int hour = scan.nextInt();
		System.out.print("Enter which timezone to convert FROM: ");
		String fromTZ = scan.next();
		System.out.print("Enter which timezone to convert TO: ");
		String toTZ = scan.next();
		System.out.println(conversionHelper.timeZone(hour, fromTZ, toTZ));

		// Gets the user weight and running duration to calculate calories burned
		System.out.print("Enter a weight in pounds: ");
		int weight = scan.nextInt();
		System.out.print("Enter a running duration in minutes: ");
		int durationInMinutes = scan.nextInt();
		System.out.println(conversionHelper.caloriesBurnedRunning(weight, durationInMinutes) + " calories burned.");

	}

}