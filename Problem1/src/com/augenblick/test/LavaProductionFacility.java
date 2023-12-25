package com.augenblick.test;

public class LavaProductionFacility {

	public static void main(String[] args) {
		String initializationSequence = "rn=1,cm-,qp=3,cm=2,qp-,pc=4,ot=9,ab=5,pc-,pc=6,ot=7";

		String[] steps = initializationSequence.split(",");

		int sum = 0;

		for (String step : steps) {
			int result = runHashAlgorithm(step);
			sum += result;
		}

		System.out.println("Sum of HASH algorithm results: " + sum);
	}

	private static int runHashAlgorithm(String step) {
		int currentValue = 0;

		for (char ch : step.toCharArray()) {

			int asciiCode = (int) ch;

			currentValue += asciiCode;

			currentValue *= 17;

			currentValue %= 256;
		}

		return currentValue;
	}
}
