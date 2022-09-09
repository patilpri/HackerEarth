import java.util.Arrays;
import java.util.List;

public class JumpingOnClouds {
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(0,0,0,1,0,0);
        int steps = jumpingOnCloud(list);
        System.out.println(steps);
    }
    public static int jumpingOnCloud(List<Integer> c) {
        //000100
        int steps = 0;
        if(c.size() == 2 && c.get(1)==0)
            steps=1;
        else {
            for (int i = 0; i < c.size(); i++) {
                if (i + 2 < c.size()) {
                    if (c.get(i + 1) == 0 && c.get(i + 2) == 0) {
                        steps = steps + 1;
                        i = i + 1;
                    } else if (c.get(i + 1) == 0 && c.get(i + 2) == 1) {
                        steps = steps + 1;
                    } else if (c.get(i + 1) == 1 && c.get(i + 2) == 0) {
                        steps = steps + 1;
                        i = i + 1;
                    }
                } else {
                    if (c.size() > 4 && c.get(c.size() - 1) == 0 && c.get(c.size() - 2) == 0 && c.get(c.size() - 3) == 1)
                        steps = steps + 1;
                    i = c.size();
                }
            }
        }
        return steps;
    }
    public static int jumpingOnClouds(List<Integer> c) {
        int steps = 1;
        for(int i =1;i<c.size();i++){
            if(c.get(i)==0 && i==c.size()-1 && c.get(i-2)==1)
                steps=steps+1;
            else if(c.get(i)==0 && i!=c.size()-1 && c.get(i+1)==0){
                steps=steps+1;
                if(c.get(i-1)!=1)
                    i=i+1;
            }else if(c.get(i)==0 && i!=c.size()-1 && c.get(i+1)!=0)
                steps =steps+1;
            System.out.println(steps+":"+i);
        }
        return steps;
    }
    public static int jumpingOClouds(List<Integer> c) {
        int count=0,i=0;
        while(i<c.size()-1){
            if(i+2 < c.size() && c.get(i+2)==0){
                i=i+1;
            }
            i=i+1;
            count= count+1;
        }
        return count;
    }
}
