import java.io.*;
public class Driver{

   public static void main(String[] args){
      ProductArray box = new ProductArray();
   
   
      int arr[] = {1,2,3,4,5};
      int arr1[] = {3,2,1};
      int n = arr.length;
      int n1 = arr1.length;
   
      System.out.println("The product array is : ");
      box.productArray(arr,n);

   }

}
