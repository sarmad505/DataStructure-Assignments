public class Intro {  	
	
    
	public static void main(String[] args) {  
		int input = 0;
		int numOfElements = 0;
		int numOfRotation = 0;
		
		input = 54;
		numOfElements = input/10;
		numOfRotation = input%10;
		int [] arr = new int [numOfElements];
		for (int i = 0; i < numOfElements; i++) {
			arr[i] = i+1;
//			System.out.print(arr[i]+" ");
			
			
		}
		int l, last;
		for (int j = 0; j <numOfRotation; j++) {
			
			last = arr[arr.length-1];
			for (l = arr.length-1; l>0;l--) {
				arr[l] = arr[l-1];	
								
			}
			arr[0] = last;
			
			System.out.print(arr[l]+ " ");
			
		}       
	}	
}
  
    
