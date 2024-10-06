package CyclicSorting;

public class FindDuplicateNumber {
  public static void main(String[] args){
    int[] arr = {1,2,4,3,4};
    System.out.println(findDuplicateNumber(arr));
  }
  private static int findDuplicateNumber(int[] arr){
    int i=0;
    while(i<arr.length){
      if(arr[i]!=i+1){
        int correct = arr[i]-1;
        if(arr[i]!=arr[correct]){
          swap(arr,i,correct);
        } else{
          return arr[i];
        }
      } else{
        i++;
      }
    }
    return -1;
  }
  static void swap(int[] arr,int i,int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = arr[i];
  }
}
