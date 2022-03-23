
public class Bubblesort {
	int[] a;

	public Bubblesort(int[] arr) {
		a = arr;
	}

	public void display() {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

	}

	public void bubbleSort() {
		int n = a.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (a[j] > a[j + 1]) {
					swap(j, j + 1);

				}
	}

	public void swap(int first, int second) {
		int temp = a[first];
		a[first] = a[second];
		a[second] = temp;

	}
}
