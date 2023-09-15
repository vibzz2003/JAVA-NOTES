import java.util.*;
public class Lstime{
    public static void main(String[] args){
        long t1 = System.nanoTime();
        int[] arr = {1,7,8,4,5,3,2,8,9};
        int target = 7;
        System.out.println(Search(arr,target));
        long t2 = System.nanoTime();
        long t3 = t2 - t1;
        System.out.println("the time taken is"+ " "+ t3);

    }

    static int Search(int[] arr, int target){
        for (int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}