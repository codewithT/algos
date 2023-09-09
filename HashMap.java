import java.util.*;

public class demo{
    public static void main(String[] args) {
        int [] arr= {1,5,4,3,3,3,7,8,9,9,1,2,4,67,8,9,9,4,32,3,5,6,78,5,4,3,2,5,7,7,8,9};
        // finding the no of occurences of elements in the array (arr);

        HashMap<Integer, Integer> hash = new HashMap<>();
        int j =0;
        for(int i=0;i<arr.length;i++){
            if(!hash.containsKey(arr[i])) {
                hash.put(arr[i] ,1 );
            }
            else{
                hash.put(arr[i] , hash.get(arr[i])+1);
            }
        }
        System.out.println(hash);

    }
}