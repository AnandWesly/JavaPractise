package com.anand.practise;

public class FindClosetNumber {

	public static void main(String[] args) {
		int arr[] = { 6, 8 ,-5,5, 1, 2};
		int target = 4;
	//	System.out.println(findClosest(arr, target));
		System.out.println(findClosestInUnsortedArr(arr, target));

		// System.out.println(findClosestEase(arr, target));
		// Arrays.sort(a);
	}

	// Returns element closest to target in arr[]
	public static int findClosestInUnsortedArr(int arr[], int target) {
		int smallestDiff = Math.abs(target - arr[0]);
		int closest = 0; // index of the current closest number
		
		for (int i = 1; i < arr.length; i++) {
			int currentDiff = Math.abs(target - arr[i]);
			if (currentDiff < smallestDiff) {
				smallestDiff = currentDiff;
				closest = i;
			}
		}
		return arr[closest];
	}

	// Returns element closest to target in arr[]
	public static int findClosest(int arr[], int target) {
		int n = arr.length;

		// Corner cases
		if (target <= arr[0])
			return arr[0];
		if (target >= arr[n - 1])
			return arr[n - 1];

		// Doing binary search
		int i = 0, j = n, mid = 0;
		while (i < j) {
			mid = (i + j) / 2;

			if (arr[mid] == target)
				return arr[mid];

			/*
			 * If target is less than array element, then search in left
			 */
			if (target < arr[mid]) {

				// If target is greater than previous
				// to mid, return closest of two
				if (mid > 0 && target > arr[mid - 1])
					return getClosest(arr[mid - 1], arr[mid], target);

				/* Repeat for left half */
				j = mid;
			}

			// If target is greater than mid
			else {
				if (mid < n - 1 && target < arr[mid + 1])
					return getClosest(arr[mid], arr[mid + 1], target);
				i = mid + 1; // update i
			}
		}

		// Only single element left after search
		return arr[mid];
	}

	// Method to compare which one is the more close
	// We find the closest by taking the difference
	// between the target and both values. It assumes
	// that val2 is greater than val1 and target lies
	// between these two.
	public static int getClosest(int val1, int val2, int target) {
		if (target - val1 >= val2 - target)
			return val2;
		else
			return val1;
	}

}
