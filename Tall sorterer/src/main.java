import java.util.Arrays;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		final int størelse = 1000000;
		
		int[] big = new int [størelse];
		
		for (int i = 0; i < størelse; i++) {
			big[i] = random.nextInt(100000);
		}
		//bubbleSort(big);
		Arrays.sort(big);
		System.out.println("ferdig sortert printer ut");
		printArray(big);
		
	}
	
	
	private static void printArray(int[] array) {
        for(int i = 0; i < array.length-1; i++) {
            System.out.print(array[i]+ ", ");
        }
        System.out.print(array[array.length-1]);
    }
	
	private static void bubbleSort(int[] array) {
		for(int j = 0; j < array.length; j++) {
			for(int i = 0; i < array.length-1; i++) {
				if (array[i] > array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
			if(j%100 == 0) {
				System.out.println("inertasjon nr: " + j);
			}
		}
	}
}
