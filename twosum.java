import java.util.*;


public class twosum {
    
    static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) { //if element:(target - elementOfArray) exist 
                result[1] = i;                          //put the index of the other element in res[1]
                result[0] = map.get(target - numbers[i]);//get the index(which is value here for the hashmap) of the first element of sum in res[0]
                return result;
            }
            map.put(numbers[i], i); //putting the element of array and index to the hashmap
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
