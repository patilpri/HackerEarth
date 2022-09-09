import java.io.*;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //in.nextInt();
        //String s = in.next();
        String s = "DDDD";

        int level = 0;
        int valleys = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'U'){
                level++;
            }else if(s.charAt(i) == 'D'){
                if(level == 0){
                    valleys++;
                }
                level--;
            }
        }
        System.out.println(valleys);
    }
}
