import java.util.HashSet;
import java.util.Scanner;

public class HashSetHacker {
    public static void main(String[] args) {

        String [] pair_left = new String[]{"john","john","john","mary","mary"};
        String [] pair_right = new String[]{"tom","mary","tom","anna","anna"};
        HashSet<String> m = new HashSet<>();
        int count =0;
        for(int i=0;i<pair_right.length;i++) {
            boolean v = m.add(pair_left[i] + " " + pair_right[i]);
            if(v)
                count = count+1;
            System.out.println(count);
        }


//Write your code here

    }
}
