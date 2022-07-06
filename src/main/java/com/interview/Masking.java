package com.interview;

public class Masking {

	public static void main(String[] args) {
		String card = "7654";
		String masked = maskify(card,4);
		System.out.println("masked is "+masked);

	}

	public static String maskify(String creditCardNumber,int noCharsMask) {

        if (creditCardNumber == null || creditCardNumber.isEmpty()) {
            return "";
        }

        if (creditCardNumber.length() < noCharsMask) {
            return creditCardNumber;
        }

        if (creditCardNumber.replaceAll("\\D", "").length() < noCharsMask) {
            return creditCardNumber;
        }

        int cardLength = creditCardNumber.length();

        String inner = creditCardNumber.substring(0, cardLength - noCharsMask);
        inner = inner.replaceAll("[0-9a-zA-Z]", "#");

        creditCardNumber =  inner + creditCardNumber.substring(cardLength - noCharsMask);
        return creditCardNumber;

    }
	
}
