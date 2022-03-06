import java.util.Scanner;
public class Arraysum {      	 
	
	 
	 public static void middleTermSum(int matrix[][], int n)
	{
	 
	    int row_sum = 0, col_sum = 0;
	     
	    // for sum of row
	    for (int i = 0; i < n; i++)
	        row_sum += matrix[n / 2][i];
	    System.out.print("SARMAD TUFAIL | ");
	     
	    System.out.println ( "Sum of middle row = "
	                  + row_sum);
	     
	    // for sum of column
	    for (int i = 0; i < n; i++)
	        col_sum += matrix[i][n / 2];
	     
	    System.out.println ( "Sum of middle column = "
	                 + col_sum);
	}
	
	 
	// Main function to execute code
	    public static void main(String[] args) {
	    	// Array input
	    	int nr ,nc;
	    	Scanner input = new Scanner(System.in);
	    	System.out.print("Enter num of rows: ");
	    	nr = input.nextInt();
	    	System.out.print("Enter num of cols: ");
	    	nc = input.nextInt();
	    	int[][] matrix = new int [nr][nc];
	    	System.out.println("Enter matrix elements: ");
	    	for (int k = 0; k < nr; k++) 
	    	for (int k2 = 0; k2 < nc; k2++) 
	    	matrix[k][k2] = input.nextInt(); 
	    	// Display matrix 			
							
			
	    	System.out.println("Elements of input matrix are:");
	    	for (int k2 = 0; k2 < nr; k2++) {
	    		for (int l = 0; l < nc; l++) {
	    	System.out.print(matrix[k2][l]+" ");}
	    			System.out.println();  		
	    												   		
			}
	    		middleTermSum(matrix, 3);        		
	     
	   }		

}
