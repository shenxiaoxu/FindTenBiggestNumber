/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author XiaoxuShen
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
         * You have a very large file of integers which cannot be loaded into memory at once. 
         * How would you find the ten largest numbers of that file?
         * How do you find the greatest 1000 elements in a list of a million elements? No other information given. 
         * What would be the runtime? 
         * Hint: You can do better than O(n log n). I didn't realize but it could be possible with Tree or Heaps.
         * solution: first using the first 1000 elements to build a min-heap. Then loop every remaining elements, if element's value
         * is bigger than the root of the heap, replace root with insert element. Heaplify heap, continue doing that until to the end.
         */
    }
    public static void LargestNumElements(int[] array){
        
    }
}
