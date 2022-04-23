
public class sellstocks{
static int maxProfit(int[] prices) {
        
    int min = Integer.MAX_VALUE, max = 0; 
  for (int price: prices) {
      min = Math.min(min, price); //taking min value b/w the current price vs min value we found before in the same array
      max = Math.max(price - min, max); //taking max of (price-min) vs max value 
  }
  return max;
}

public static void main(String[] args){
    int arr[]={1,2,3,1,6};
        
   
    System.out.println(maxProfit(arr));

}}