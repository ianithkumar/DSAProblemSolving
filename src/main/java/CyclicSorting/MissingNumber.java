package CyclicSorting;

public class MissingNumber {
  public static void main(String[] args){
    int[] arr = {4,0,2,1};
    System.out.println(missingNumber(arr));
  }
  private static int missingNumber(int[] arr){
    int i=0;
    while(i<arr.length){
      int correctIndex = arr[i];
      if(arr[i] < arr.length && arr[i]!=arr[correctIndex]){
        swap(arr,i,correctIndex);
      } else{
        i++;
      }
    }

    for(int j=0;j< arr.length;j++){
      if(arr[j]!=j){
        return j;
      }
    }
    return arr.length;
  }
  private static void swap(int[] arr,int i,int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
