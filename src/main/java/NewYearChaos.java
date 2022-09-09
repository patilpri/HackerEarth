import java.util.ArrayList;
import java.util.List;

public class NewYearChaos {
    public static void minimumBribes(List<Integer> q) {
        List<Integer> g = new ArrayList<>();
        int h=0;
        while(h<q.size()){
            g.add(h+1);
            h++;
        }
        int min=0;
        boolean first = true;
        for(int i=0;i<q.size();i++){
            if(q.get(i)-(i+1)>2) {
                System.out.println("Too chaotic");
                min=-1;
                break;
            }
            else if(first == true) {
                min = q.get(i) - (i + 1);
                if(min !=0) {
                    first = false;
                    int temp=0;
                    if((q.get(i)-(i+1)) == 1) {
                        temp=g.get(i);
                        g.set(i,g.get(i+1));
                        g.set(i+1,temp);
                    }
                    else{
                        temp = g.get(i);
                        g.set(i,g.get(i+2));
                        g.set(i+2,g.get(i+1));
                        g.set(i+1,temp);
                    }
                }
            }
            else if((q.get(i)-(i+1))>0) {
                min = min + (q.get(i) - (i + 1));
                int temp;
                if((q.get(i)-(i+1)) == 1) {
                    temp=g.get(i);
                    g.set(i,g.get(i+1));
                    g.set(i+1,temp);
                }
                else{
                    temp = g.get(i);
                    g.set(i,g.get(i+2));
                    g.set(i+2,g.get(i+1));
                    g.set(i+1,temp);
                }
            }

        }
        if(q.get(q.size()-1)!=g.get(g.size()-1) && min != -1)
            min = min + 1;

        if(min!=-1)
            System.out.println(min);
    }

    public static void main(String[] args) {
        List<Integer> q = new ArrayList<>();
        q.add(4);q.add(1);q.add(2);q.add(3);//q.add(4);q.add(6);q.add(7);q.add(8);
        minimumBribes(q);
    }
}
