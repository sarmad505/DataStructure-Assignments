
public class InsertionSort {
	int[] a;
	public InsertionSort(int[] arr) {
		a = arr;
	}

	public void display() {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

	}

	public void insertionSort() {
		int n = a.length;
		for (int j = 1; j < n; j++) {
			int key = a[j];
			int i = j - 1;
			while ((i > -1) && (a[i] > key)) {
				a[i + 1] = a[i];
				i--;
			}
			a[i + 1] = key;
		}
	}
}
