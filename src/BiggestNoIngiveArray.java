
public class BiggestNoIngiveArray {
public static void BiggestNoIngiveArray(int[] inputData) {
		
		int size=inputData.length;
		int max = inputData[0];
		for(int i=0;i<size;i++) {
			if(inputData[i]>max) {
				max=inputData[i];
				
			}
			
			
		}
		System.out.println(max);
			
}

	public static void main(String[] args) {
		
		int[] inputData= {90,70,60,50,30,20,10};
		BiggestNoIngiveArray(inputData);
	}

}
