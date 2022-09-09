import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SockMerchant {
    public static void main(String args[]){
        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(2);
        ar.add(4);
        ar.add(4);
        ar.add(4);
        ar.add(4);
        int pair = sockMerchant(7,ar);
        System.out.println(pair);
    }
    public static int sockMerchant(int n, List<Integer> ar) {
        HashMap<Integer,Integer> sockpair = new HashMap<>();
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(ar.get(i)==ar.get(j))
                    count=count+1;
            }
            sockpair.put(ar.get(i),count);

        }
        System.out.println("count:"+sockpair);

        int pair =0;
        for(int i:sockpair.values()){
            System.out.println("i:"+i);
            pair= pair+(i/2);
        }
        return pair;
        /*
        HashSet<Integer> unmatched = new HashSet<>();
int pairs = 0;
for(int i = 0; i < arr.length; i++) {
    if(!unmatched.add(arr[i])) {
        unmatched.remove(arr[i]);
        pairs++;
    }
}
         */
    }
}
