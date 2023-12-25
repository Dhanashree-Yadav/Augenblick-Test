package com.augenblick.test;

public class ReflectingDish {

	public static void main(String[] args) {

		String[] platformConfig = { "O....#....", "O.OO#....#", ".....##...", "OO.#O....O", ".O.....O#.", "O.#..O.#.#",
				"..O..#O..O", ".......O..", "#....###..", "#OO..#...." };

		int totalLoad = calculateTotalLoad(platformConfig);
		System.out.println("Total Load on North Support Beams: " + totalLoad);
	}

	private static int calculateTotalLoad(String[] platformConfig) {
		int totalLoad = 0;

		for (int i = 0; i < platformConfig.length; i++) {

			for (int j = 0; j < platformConfig[i].length(); j++) {
				char currentChar = platformConfig[i].charAt(j);

				if (currentChar == 'O') {
					totalLoad += i + 1;
				}
			}
		}

		return totalLoad;
	}
}
