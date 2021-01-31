package com.company.Olshefski;

public class Main {

	public static void main(String[] args) {
		String week[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		double temp[] = {45.0, 29.0, 10.0, 22.0, 41.0, 28.0, 33.0};
		double prob[] = {95, 60, 25, 5, 0, 75, 90};

		for (int i = 0; i <= 6; i++) {
			if (temp[i] <= 32 && prob[i] > 50) {
				System.out.println("its likely to snow on: " + week[i]);
			}

		}
	}
}
