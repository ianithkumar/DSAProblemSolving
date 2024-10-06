package CyclicSorting;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
  public static void main(String[] args){
    //int[] arr = {4,3,2,7,8,2,3,1};
    int[] arr = {1,1};
    System.out.println(findAllNumbersDisappearedInAnArray(arr));
  }
  private static List<Integer> findAllNumbersDisappearedInAnArray(int[] arr){
    int i=0;
    while(i<arr.length){
      int correctIndex = arr[i]-1;
      if(arr[i]!=arr[correctIndex]){
        swap(arr,i,correctIndex);
      } else{
        i++;
      }
    }

    List<Integer> result = new ArrayList<>();
    for(int j=0;j< arr.length;j++){
      if(arr[j]!=j+1){
        result.add(j+1);
      }
    }
    return result;
  }
  static void swap(int[] arr,int i,int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
