package bptn.com.Leetcode.MissingNumber;

public class Solution {

	public static int missingNumber(int[] nums) {
		int n = nums.length;

		int artimeticSum = n * (n + 1) / 2;

		int totalSum = 0;
		for (int i = 0; i < nums.length; i++) {
			totalSum += nums[i];
		}
		return artimeticSum - totalSum;
	}

	public static void main(String[] args) {

		int[] nums = { 3, 0, 1 };
		System.out.println(missingNumber(nums));

	}

}
