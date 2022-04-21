import java.util.*;

public class ContainsDuplicate{

 static boolean containsDuplicate(int[] nums) {

    Set<Integer> distinct = new HashSet<Integer>();
    for(int num : nums) {
        if(distinct.contains(num)) {
            return true;
        }
        distinct.add(num);
    }
    return false;
}

public static void main(String[] args){
        int arr[]={1,2,3,1};

        boolean b=containsDuplicate(arr);
        System.out.println(b);

}

}