package bptn.com.Leetcode.AverageSalary;

import java.util.Arrays;

class Solution {
	public static double average(int[] salary) {

		Arrays.sort(salary);

		double totalSalary = 0;

		for (int i = 1; i < salary.length - 1; i++) {
			totalSalary = totalSalary + salary[i];
		}

		double averageSalary = totalSalary / (salary.length - 2);

		System.out.println("The average salary excluding the minimum and maximum is " + averageSalary);

		return averageSalary;
	}

	public static void main(String[] args) {
		int[] salary = { 4000, 3500, 1000, 1000 };

		average(salary);
	}
}