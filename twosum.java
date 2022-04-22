import java.util.*;


public class twosum {
    
    static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }

    public static void main(String[] args){
        int arr[]={1,2,3,1,2};
            int target=3;
       
        for(int i:twoSum(arr,target)){
            System.out.println(i);
        }

}
}
