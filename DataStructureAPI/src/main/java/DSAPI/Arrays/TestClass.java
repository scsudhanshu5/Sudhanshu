package DSAPI.Arrays;

public class TestClass {
	public static void main(String[] args) throws Exception {
		ArrayInstance ai = new  ArrayInstance();
		Integer[] array = new Integer[] {1,2,3,4,5,6,7,8,9,10};
		/*Integer[] a = ai.rotateArray(array, 4, 10);
		for(int i =0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		Integer[] b =  ai.rotateArray(array, 4);
		Integer[] c = ai.ritateArrayByOne(array);
		ai.printArray(c);*/
		//ai.linearSearch(array, 11);
		System.out.println(ai.binarySearch(array, 0, 9, 4));
	}
	
	public static void fiveDArray() {
		String[][][][][] fiveDArray = new String[2][2][2][2][2];
		for(int i=0;i<fiveDArray.length;i++) {
			for(int j=0;j<fiveDArray[i].length;j++) {
				for(int k=0;k<fiveDArray[i][j].length;k++) {
					for(int l=0;l<fiveDArray[i][j][k].length;l++) {
						for(int m=0;m<fiveDArray[i][j][k][l].length;m++) {
							fiveDArray[i][j][k][l][m] = i+" "+j+" "+k+" "+l+" "+m+" ";
						}
					}
				}
			}
		}
		int count = 0;
		for(int i=0;i<fiveDArray.length;i++) {
			for(int j=0;j<fiveDArray[i].length;j++) {
				for(int k=0;k<fiveDArray[i][j].length;k++) {
					for(int l=0;l<fiveDArray[i][j][k].length;l++) {
						for(int m=0;m<fiveDArray[i][j][k][l].length;m++) {
							System.out.println(fiveDArray[i][j][k][l][m]);
							System.out.println("Number of elements in Array: "+count);
							count++;
						}
					}
				}
			}
		}
	}
	
	public void testMethod() {
		//ArrayInstance<Integer> a = ArrayInstance.getArray(10);
				Integer[] a = new Integer[]{1,2,3,4,5,6,7,8,9,10};
				for(int i:a) {
					System.out.println("a:"+a[i-1]);
				}
				
				Integer[] b = a.clone(); //It will create deep clone
				System.out.println(a==b); //Proof that array cloning makes deep clone
				for(int i:b) {
					System.out.println("b:"+b[i-1]);
				}
				
				
				int[][] twoDimArray = new int[3][2];
				for(int i = 0; i<twoDimArray.length; i++) {
					for(int j = 0; j<twoDimArray[i].length;j++) {
						twoDimArray[i][j] = i*j;
					}
				}
				for(int i = 0; i<twoDimArray.length; i++) {
					for(int j = 0; j<twoDimArray[i].length;j++) {
						System.out.println(twoDimArray[i][j]+"	");
					}
					System.out.println("\n");
				}
				System.out.println(a.getClass());
				System.out.println(twoDimArray.getClass());
				
				fiveDArray();
	}
}
