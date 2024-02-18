import java.util.*;

// codeforces Contest -927
// A. Thorns and Coins
class codeForces {
    public static long solve(char []ar ,int idx, long [] dp){
        if(idx >=ar.length){
            return 0;
        }
        if(ar[idx] == '*'){
            return 0;
        }
        if(dp[idx] != -1){
            return dp[idx];
        }

//
//.@@*@.**@@


         long   cnt =  solve(ar, idx + 1 , dp);
          long  nt =  solve(ar, idx + 2 , dp);

        if(ar[idx] == '@'){
            dp[idx] = 1+ Math.max(cnt,nt);
            return 1 + Math.max(cnt, nt);
        }



        return Math.max(cnt, nt);
    }
     
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            
        
        int len = sc.nextInt();
          String s = sc.next();
          long [] dp = new long[s.length()];
           Arrays.fill(dp,-1);
           char [] ar= s.toCharArray();
           long res =solve(ar, 0, dp);
 
           System.out.println(res);
		  }

    }
}
