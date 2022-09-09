import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class HourGlass {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        int count = 0,countmax=0;
        int[][] gty = new int[][]{{-1,-1,0,-9,-2,-2},{-2,-1,-6,-8,-2,-5},{-1,-1,-1,-2,-3,-4},{-1,-9,-2,-4,-4,5},{-7,-3,-3,-2,-9,-9},{-1,-3,-1,-2,-4,-5}};
        for(int i=0;i+2<6;i++){
            for(int j=0;j+2<6;j++) {
                count = gty[i][j] + gty[i][j + 1] + gty[i][j + 2] + gty[i + 1][j + 1] + gty[i + 2][j] + gty[i + 2][j + 1] + gty[i + 2][j + 2];
                //count = arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)+arr.get(i+1).get(j+1)+arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);
                if(i==0 && j==0) {
                    countmax = count;
                    System.out.println(gty[i][j] +" "+ gty[i][j + 1] +" "+ gty[i][j + 2]
                            + " " +gty[i + 1][j + 1] +" "+ gty[i + 2][j] +" "+ gty[i + 2][j + 1] +" "+
                            gty[i + 2][j + 2]);
                }
                //System.out.println(count);
                if (count > countmax)
                    countmax = count;
            }
        }
        System.out.println("co"+countmax);
    }
}
