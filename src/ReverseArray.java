
public class ReverseArray {
	public static void reverse(int[] inputData) {
		
		int size=inputData.length;
		for(int i=size-1;i>=0;i--) {
			System.out.println(inputData[i]);
			
		}
	}
public static void reversemethod2(int[] inputData) {
		
		int size=inputData.length;
		int lastindex=size-1;
		int temp=0;
		for(int i=0;i<size/2;i++) {
			 temp=inputData[i];
			inputData[i]=inputData[lastindex-i];
			inputData[lastindex-i]=temp;
			
		
			
		}
		for(int i=0;i<inputData.length;i++) {
			System.out.println(inputData[i]);
			
			}
	}
	public static void main(String[] args) {
		int[] inputData= {90,70,60,50,30,20,10};
		reverse(inputData);
		reversemethod2(inputData);
	}

}
