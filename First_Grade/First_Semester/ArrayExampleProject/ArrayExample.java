/*
 * Array object에 대한 실습입니다.
 * Array객체를 출력해주는 printArray 메소드와 찾는 findArray 메소드를 작성했습니다.
 * 작성일자: 2022-05-18
 * 작성자: 소융대 22학번 조한별
 */
import java.util.*;
public class ArrayExam {
	public static void main(String[] args) {

		// 변수 위치
		int[] arr = {10, 1, 6, 5, 7, 8, 9, 3, 2, 4};
		int[] arr2 = {1, 3, 4, 6, 8, 9, 12, 14, 17, 20};
		Scanner scan = new Scanner(System.in);
		int inputValue;
		int location;

		//처리
		printArray(arr);	

		//bubbleSort(arr);
		selectionSort(arr);

		printArray(arr);

		//printArray(arr2);

		/*
		System.out.print("찾을 값을 입력하세요: ");
		inputValue = scan.nextInt();
		location = binarySearch(arr2, inputValue);


		//location = findArray(arr, inputValue);		


		if (location == -1) {
			System.out.println("찾는 값" + inputValue + "는 배열에 없습니다.");	
		} else {
			System.out.println("찾는 값" + inputValue + "는 배열에 " + location + "번째에 있습니다.");
		}
		 */

	}

	public static void selectionSort(int[] arr) {
		
		int minIndex = 0;

		for(int i = 0; i < arr.length; i++) {
			minIndex = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex]; // swap
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	public static void bubbleSort(int[] arr) {

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j + 1]);
				int temp = arr[j]; //swap
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}



	}

	public static int binarySearch(int[] arr, int inputValue) {
		int index = -1;
		int start = 0;
		int end = arr.length;
		int mid;

		while(start >= end) {
			mid = (start + end) / 2; //배열의 중앙

			if(arr[mid] == inputValue)
				return mid;
			else if(arr[mid] < inputValue) {
				start = mid+1;
			} else {
				end = mid-1;
			}
		}
		return index;
	}

	public static int findArray(int[] arr, int inputValue) { // 순차 검색

		int index = -1; // 인덱스에는 -값이 없다.

		for(int i = 0; i < arr.length; i++) {
			if (inputValue == arr[i]) {
				//				System.out.println("찾는 값" + inputValue + "는 배열에 " + i + "번째에 있습니다.");
				index = i;
			}
		}

		return index;

	}

	//binary search -> 장점-빠름 단점-정렬이 되어있어야함

	public static void printArray(int[] ar) {

		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}
}
