import java.io.*;
import java.util.*;


public class ArrayManipulation {
    public static void main(String[] args) throws IOException {
        List<List<Integer>> queries = new ArrayList<>();
        List<Integer> e = new ArrayList<>();
        e.add(1);e.add(5);//e.add(3);
        queries.add(new ArrayList(e));
        e.clear();
        e.add(4);e.add(8);e.add(7);
        queries.add(new ArrayList(e));
        e.clear();
        e.add(6);e.add(9);e.add(1);
        queries.add(new ArrayList(e));
        //System.out.println(queries);
        long g = arrayManipulation(10,queries);
        System.out.println(g);
    }
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        int[] arr = new int[n];
        for(int i=0;i<queries.size();i++){
            for(int j = queries.get(i).get(0)-1;j<queries.get(i).get(1);j++){
                if(queries.get(i).size()!=3)
                    break;
                arr[j]= arr[j]+queries.get(i).get(2);
            }
        }
        int max = arr[0];
        for(int k=0;k<n;k++){
            System.out.println(arr[k]);
            if(arr[k]>max)
                max =arr[k];
        }
        return max;
    }
}
