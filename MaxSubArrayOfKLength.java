public class MaxSubArrayOfKLength{
  public static void main(String args[]){
    int[] arr=new int[]{2,3,6,3,-3,6,-14,15};
    int k=3;
    int wSum=0;
    int mSum=Integer.MIN_VALUE;
    for(int i=0;i<k;i++){
      wSum=wSum+arr[i];
    }
    mSum=Math.max(wSum,mSum);
    for(int i=k;i<arr.length;i++){
      wSum=wSum-arr[i-k]+arr[i];
      mSum=Math.max(wSum,mSum);
    }
    System.out.println("Max sum: "+mSum);
  }
}
