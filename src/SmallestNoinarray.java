
public class SmallestNoinarray {
public static void SmallestNoIngiveArray(int[] inputData) {
		
		int size=inputData.length;
		int min = inputData[0];
		for(int i=0;i<size;i++) {
			if(inputData[i]<min) {
				min=inputData[i];
				
			}
			
			
		}
		System.out.println(min);
			
}
public static void MinMaxNoIngiveArray(int[] inputData) {
	
	int size=inputData.length;
	int min = inputData[0];
	int max = inputData[0];
	for(int i=0;i<size;i++) {
		if(inputData[i]<min) {
			min=inputData[i];
			
		}
		if(inputData[i]>max) {
			max=inputData[i];
			
		}
		
	}
	System.out.println("Max = "+max);
	System.out.println("Min = "+min);
		
}

	public static void main(String[] args) {
		
		int[] inputData= {90,70,60,50,30,20,10};
		SmallestNoIngiveArray(inputData);
		MinMaxNoIngiveArray(inputData);
	}

}