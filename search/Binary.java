package search;


/**
 * Write a description of class Binary here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Binary
{
  
  /**
   * Returns the index of the target value, or -1 if not found
   */
  public static int search(int[] arr, int target) {

  }
  
  public static void main(String[] args) {
    int[] arr = {53,85,93,25,39,27,42,5,24,45,33,51,5,80,4,7,91,
      31,66,71,32,19,79,58,61,82,89,63,7,4,50,10,48,24,75,19,22,
      73,54,51,25,33,20,52,79,97,70,54,63,49};
    int left, right, mid;
    
    // Your algorithm goes here!
    
    System.out.println("Return index is: "+search(arr, 82));
  }

}
