
public class BinarySearch {
	int[] a;

	public BinarySearch(int[] arr) {
		a = arr;
	}

	public void display() {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public int find(long searchKey) {
		int lowerBound = 0;
		int upperBound = a.length - 1;
		int mid;
		while (true) {
			mid = (lowerBound + upperBound) / 2;
			if (a[mid] == searchKey)
				return mid;
			else if (lowerBound > upperBound)
				return a.length;
			else {
				if (a[mid] < searchKey)
					lowerBound = mid + 1;
				else
					upperBound = mid - 1;
			}
		}
	}
}
