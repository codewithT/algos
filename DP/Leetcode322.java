class Solution {
    public int solve(int [] coin, int idx, int sum, int [][] lis){
        if(sum ==0)return 0;
        if(idx ==0){
            if(sum %coin[0] == 0){
                return sum/coin[0];
            }
            else{
                return Integer.MAX_VALUE-10000;
            }
        }
        if(lis[idx][sum] != -1) return lis[idx][sum];
       int notake =  solve(coin, idx-1, sum, lis ); 
       int take = Integer.MAX_VALUE;
       if(sum>= coin[idx]){
           
          take = 1+ solve(coin, idx, sum-coin[idx], lis); 
       }
       lis[idx][sum] = Math.min(notake, take);
        return Math.min(notake, take);
    }
  public int coinChange(int[] coins, int amount) {
     // ArrayList<Integer> lis= new ArrayList<>();
        int [][] lis = new int[coins.length+1][amount+1];
      for(int i =0;i<lis.length;i ++){
          for(int j =0;j<lis[i].length;j++){
              lis[i][j] = -1;
          }
      }
      int res = Math.max(-1, solve(coins , coins.length-1, amount, lis));
      if(res >= 1000000){
          return -1;
      }
      return res;
  }
}