package DSAPI.Arrays;

public class RotateArray {
	static int[] rotateLeft(int array[],int d,int n) {
		int[] temp = new int[d];
		for(int i = 0; i<d; i++) {
			temp[i] = array[i];
			/*System.out.println(temp[i]);*/
		}
		
		for(int i = 0;i<n-d;i++) {
			array[i] = array[i+d];
			/*System.out.println(array[i]);*/
		}
		for(int i = n-d, j=0; i<n;i++,j++) {
			array[i] = temp[j];
			/*System.out.println(array[i]);*/
		}
		return array;
	}
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7};
		array = rotateLeft(array, 2, 7);
		for(int i = 0;i<7;i++) {
			System.out.println(array[i]);
		}
	}

}
