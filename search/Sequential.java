package search;


/**
 * Write a description of class SequentialSearch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sequential
{
  
  /**
   * Returns the index of the target value, or -1 if not found
   */
  public static int search(int[] arr, int target) {
    // Your algorithm goes here!
    
  }
  
  public static void main(String[] args) {
    int[] arr = {53,85,93,25,39,27,42,5,24,45,33,51,5,80,4,7,91,
      31,66,71,32,19,79,58,61,82,89,63,7,4,50,10,48,24,75,19,22,
      73,54,51,25,33,20,52,79,97,70,54,63,49};
    int left, right, mid;
    
    printResult(82, search(arr, 82) == 25);
    printResult(49, search(arr, 49) == arr.length-1);
    printResult(-4, search(arr, -4) == -1);
  }
  
  public static void printResult(int target, boolean result) {
    System.out.println("Search for "+target+": "+((result) ? "CORRECT" : "INCORRECT"));
  }

}
