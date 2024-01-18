package Loops;

public class ReverseSeqence {
    public static void main(String[] args) {
        //Q: Reverse the given integar
        int n = 16674;
        //String numStore = "";

        int ans = 0;
        
        while(n > 0){
            int last = n % 10;

            //String lastString = Integer.toString(last);

            //numStore += lastString;

            ans = ans * 10 + last;

            n /= 10;
        }

        //int numInt = Integer.parseInt(numStore);
        
        System.out.println(ans);
    }
}
