/*
	Test the binary search funciton
*/

public class BinarySearch
{
	public static int binarySearch(int[] num, int target) {
		int first = 0;
		int last = num.length;
		int mid;
		while (first < last) {
			mid = (first + last)/2;
			if (num[mid] == target) {
				return mid;
			} else if (target > num[mid]) {
				first = mid + 1;
			} else {
				last = mid;
			}
		}
		return -1;
	}
}