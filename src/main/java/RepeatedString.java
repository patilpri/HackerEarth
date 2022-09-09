public class RepeatedString {
    public static void main(String args[]){
        String s ="a";
        long n=1000000000;
        long h = repeatedString(s,n);
        System.out.println("h:"+h);
    }
    public static long repeatedString(String s, long n) {
        String j= s;
        int count =0;
        if(n==0)
            return 0;
        else{
            int l=0;
            for(int i=0;i<n;i++){
                //System.out.println("i:"+i+"l:"+l);
                if(s.charAt(l)=='a')
                    count = count+1;
                if(l==s.length()-1)
                    l=0;
                else
                    l++;
            }
        }
        return count;
    }
    public static long repeatedStrings(String s, long n) {
        long num = n/s.length();
        long rem = n%s.length();
        long ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a') {
                ans += num;
                if (i < rem)
                    ans++;
            }
        }
        return ans;
    }

}
