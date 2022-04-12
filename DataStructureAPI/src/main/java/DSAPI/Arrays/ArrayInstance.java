package DSAPI.Arrays;


/*
 * @param <E> type of element in this Array.
 * 
 * @Author- Sudhanshu Chaturvedi
 * @Started- 29 Dec 2020
 * 
 */
public class ArrayInstance<E> {
	
	private int size=0;
	
	public static<E> E[] getArray(int size) {
		E[] arrayData = (E[])new Object[size];
		return arrayData;
	}
	
	
	/*
	 * This method will rotate an Array from the given element index
	 */
	public Integer[] rotateArray(Integer[] array, int elementIndex, int length) {
		Integer[] tempArray = new Integer[length];
		Integer lastElement = array[length-1];
		for(int i=elementIndex, j=0;j<array.length;i++,j++) {
			tempArray[j] = array[i];
			if(array[i]==lastElement) {
				i=-1;
			}
		}
		return tempArray;
	}
	
	/*
	 * Second method to rotate an array
	 * It breaks an array in to two and reverse them.
	 * After reversing concatenate both Arrays, and again reverses that final array. 
	 */
	public Integer[] rotateArray(Integer[] array, int elementIndex) {
		int j =0;
		int k =0;
		Integer[] secondArray = new Integer[array.length-elementIndex];
		for(int i=0,index=elementIndex;i<secondArray.length;i++,index++) {
			secondArray[i]=array[index];
		}
		Integer[] firstArray = new Integer[array.length-secondArray.length];
		for(int i=0,index=elementIndex;i<index;i++) {
			firstArray[i]=array[i];
		}
		firstArray = reverseArray(firstArray);
		secondArray = reverseArray(secondArray);
		for(int i = 0;i<array.length;i++) {
			if(i<firstArray.length) {
				array[i]=firstArray[j];
				j++;
			} else {
				array[i]=secondArray[k];
				k++;
			}
		}
		return reverseArray(array);
	}
	
	
	
	/*
	 * This method will rotate elements by one place right side, and place current last element on first position.
	 */
	public Integer[] ritateArrayByOne(Integer[] array) {
		Integer temp = array[array.length-1];
		for(int i=array.length-1;i>0;i--) {
			array[i] = array[i-1];
		}
		array[0] = temp;
		return array;
	}
	
	
	/*
	 * This method will reverse an Array
	 */
	public Integer[] reverseArray(Integer[] array) {
		
		for(int i=0,j=array.length-1;i<array.length/2;i++,j--) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		return array;
	}
	
	/*
	 * This method searches an element inside element and returns it's index if found otherwise returns -1.
	 */
	public int linearSearch(Integer[] array, int element) {
		int index = -1;
		for (int i=0;i<array.length;i++) {
			if(array[i]==element) {
				index = i+1;
				break;
			}
		}
		System.out.println("Index of element: "+index);
		return index;
	}
	
	/*
	 * This method searches an element inside element and returns it's index if found otherwise returns -1.
	 * In this method array must be sorted.
	 */
	public int binarySearch(Integer[] array, int startIndex, int lastIndex,  int element) throws Exception {
		System.out.println(startIndex+"   "+lastIndex);
		size++;
		if(size==10) {
			throw new Exception();
		}
		if(startIndex<=lastIndex) {
			int arrayMid = (startIndex+(lastIndex-1))/2;
			if(array[arrayMid] == element) {
				System.out.println("Mid Element");
				return arrayMid+1;
			}
			if(element<array[arrayMid]) {
				System.out.println("Element is less");
				return binarySearch(array, startIndex, arrayMid-1, element);
			} else {
				System.out.println("Element is more");
				return binarySearch(array, arrayMid+1, lastIndex, element);
			}
		}
		return -1;
	}
	
	
	/*
	 * This method prints an array elements.
	 */
	public static void printArray(Integer[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
}
