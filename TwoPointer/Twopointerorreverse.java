public class Twopointerorreverse {
   public static void main(String[] args) {
       int[] arr={5,6,4,9,2,7,3};
       int n = arr.length;
       int i = 0, j=n-1;
       while(i<j){
           int temp= arr[i];
           arr[i] = arr[j];
           arr[j]= temp;
           i++;
           j--;
       }
       for (int versha:arr){
           System.out.print(versha+" ");
       }
    }
}
