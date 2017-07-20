package exercise;

import java.util.Scanner;

public class CreditCardNumberValidation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a credit card number: ");

		long creditcardNumber = input.nextLong();

		// int digit = (int) (creditcardNumber % 10);
		// long remaining = creditcardNumber / 10;

		// System.out.println(digit);
		// System.out.println(remaining);

		System.out.println(creditcardNumber + " is " + (isValid(creditcardNumber)? "Valid" : "Invalid"));

	}

	/** Return true if the card number is valid */
	public static boolean isValid(long number) {
		boolean valid = (getSize(number) >= 13 && getSize(number) <= 16)
				&& (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37)
						|| prefixMatched(number, 6))
				&& ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);

		return valid;

	}

	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		String num = number + "";
		for (int i = getSize(number) - 2; i >= 0; i -= 2) {
			sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
		}
		return sum;
	}

	/**
	 * Return this number if it is a single digit, otherwise, return the sum of
	 * the two digits
	 */
	public static int getDigit(int number) {
		if (number < 9)
			return number;
		else
			return number / 10 + number % 10;
	}

	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number) {
		int sum = 0;
		String num = number + "";
		for (int i = getSize(number) - 1; i >= 0; i -= 2) {
			sum += Integer.parseInt(num.charAt(i) + "");
		}
		return sum;
	}

	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		return getPrefix(number, getSize(d)) == d;
	}

	/** Return the number of digits in d */
	public static int getSize(long d) {
		int numberOfDigits = 0;
		while (d != 0) {
			numberOfDigits++;
			d = d / 10;
		}
		return numberOfDigits;
	}

	/**
	 * Return the first k number of digits from number. If the number of digits
	 * in number is less than k, return number.
	 */
	public static long getPrefix(long number, int k) {
		if (getSize(number) < k) {
			return number;
		} else {
			String num = number + "";
			return Long.parseLong(num.substring(0, k));
		}
	}

}
