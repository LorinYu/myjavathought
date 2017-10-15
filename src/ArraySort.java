
public class ArraySort {

  public static void main(String[] args) {
    int[] arr1 = returnArray();
    int[] arr2 = bubbleSort(arr1);
    printArray(arr2);
  }

  
  // ctrate an array
  public static int[] returnArray() {
    int[] array1 = {9,0,2,0,4};
    return array1;
  }
  
  //print an array
 public static void printArray(int[] array) {
   for (int e: array) System.out.print(e);
 }
  
  // bubblesort
  public static int[] bubbleSort(int[] numbers) {
    int temp = 0;
    int size = numbers.length;
    for (int  i = 0; i < size - 1; i++) {
      for (int j = 0; j < size - 1 - i; j++) {
        if (numbers[j] > numbers[j+1]) {
          temp = numbers[j];
          numbers[j] = numbers[j+1];
          numbers[j+1] = temp;
        }
      }
    }
    return numbers;
  }
}
