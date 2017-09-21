
public class Array170917 {

  public static void main(String[] args) {
    int[] array1 = {2,3,4,5,6};
    int[] array2 = reverse(array1);
    arrayPrint(array2);
  }
  
  
  // print an array
  public static void arrayPrint(int[] list) {  
    for (int e : list)
      System.out.println(e);   
  }
  
  // reverse an array
  public static int[] reverse(int[] list) {
    int[] result = new int[list.length]; 
    
    for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
      result[j] = list[i];
    }
    
    return result;
  }
}
