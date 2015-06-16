package arrayCombine;

public class CombineArrayz {
	public static void main(String[] args) {
		int[] array1 = {3, 4, 7};
		int[] array2 = {1, 2, 9};
		int[] comboArray = new int[array1.length + array2.length];
		comboArray = combineArrays(array1, array2);
		displayArray(comboArray);
	}
	
	public static int[] combineArrays(int[] array1, int[] array2) {
		int[] comboArray = new int[array1.length + array2.length];
		for (int i = 0; i < array1.length; i++) {
			comboArray[i] = array1[i];
		}
		for (int j = 0 ; j < array2.length; j++) {
			comboArray[(array1.length) + j] = array2[j];
		}
		return comboArray;
	}
	
	public static void displayArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
	
	public static int[] sortArray(int[] array) {
		boolean unsorted = true;
		for (int i = 1; i < array.length && unsorted; i++) {
			unsorted = false;
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j +1];
					array[j + 1] = temp;
					
					unsorted = true;
				}
			}
		}
		return array;
	}
}