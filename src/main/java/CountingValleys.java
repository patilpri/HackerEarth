public class CountingValleys {
    public static void main(String args[]){
        String path = "DDDD";
        int count = countingValley(8,path);
        System.out.println(count);
    }
    public static int countingValley(int steps, String path) {
        char[] path1 = path.toCharArray();
        boolean valley = false;
        char type;
        int count = 0,countvalley =0;
        if(path1[0]=='U') {
            type = 'M';
            count =  1;
            for(int i=1;i<path1.length;i++){
               if(path1[i]=='U' && count==0) {
                   if(type =='V')
                       countvalley = countvalley + 1;
                   type = 'M';
                   count = 1;
               } else if(path1[i]=='U' && count!=0){
                   if(type == 'M')
                       count = count + 1;
                   else
                       count = count - 1;
               } else if(path1[i]=='D' && count==0){
                   if(type =='V')
                       countvalley = countvalley + 1;
                   type = 'V';
                   count = 1;
               }else if(path1[i]=='D' && count!=0){
                   if(type == 'V')
                       count = count + 1;
                   else
                       count = count - 1;
               }
            }
        }
        else{
           type = 'V';
            count = 1;
            for(int i=1;i<path1.length;i++){
                if(path1[i]=='U' && count==0) {
                    if(type =='V')
                        countvalley = countvalley + 1;
                    type = 'M';
                    count = 1;
                } else if(path1[i]=='U' && count!=0){
                    if(type == 'M')
                        count = count + 1;
                    else
                        count = count - 1;
                } else if(path1[i]=='D' && count==0){
                    if(type =='V')
                        countvalley = countvalley + 1;
                    type = 'V';
                    count = 1;
                }else if(path1[i]=='D' && count!=0){
                    if(type == 'V')
                        count = count + 1;
                    else
                        count = count - 1;
                }
            }
        }
        if(count == 0 && type == 'V')
            countvalley = countvalley + 1;
        return countvalley;
    }
}
