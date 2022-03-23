
public class SelectionSort {
	int[] a;

	public SelectionSort(int[] arr) {
		a = arr;
	}

	public void display() {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public void selectionSort() {
		int i, j, small;
		int n = a.length;
		for (i = 0; i < n - 1; i++) {
			small = i;

			for (j = i + 1; j < n; j++)
				if (a[j] < a[small])
					small = j;

			int temp = a[small];
			a[small] = a[i];
			a[i] = temp;

		}

	}

}
