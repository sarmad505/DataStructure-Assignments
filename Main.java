
public class Main {
	public static void main(String[] args) {
		System.out.println("Sarmad Tufail |EB21103121");

		int[] a = { 10, 8, 6, -4, 5, 3, 2 };
		System.out.println("***Array Display before sorting***");

		Bubblesort bubbleSort = new Bubblesort(a);
		bubbleSort.display();
		System.out.println();
		System.out.println("***After Bubble Sort***");
		bubbleSort.bubbleSort();
		bubbleSort.display();
		System.out.println();

		SelectionSort selectionObj = new SelectionSort(a);
		selectionObj.selectionSort();
		System.out.println("***After Selection Sort***");
		selectionObj.display();
		System.out.println();

		InsertionSort insertObj = new InsertionSort(a);
		insertObj.insertionSort();
		System.out.println("***After Insertion Sort***");
		insertObj.display();
		System.out.println();

		BinarySearch binaryObj = new BinarySearch(a);
		System.out.println("***Binary Search***");
		int i = binaryObj.find(10);
		System.out.println("Element found at index: " + ++i);

	}

}
