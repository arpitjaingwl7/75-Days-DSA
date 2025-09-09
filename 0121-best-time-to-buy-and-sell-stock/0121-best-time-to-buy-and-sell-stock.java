class Solution {
    public int maxProfit(int[] prices) {
        
        // Step-1 create a min array
         int n=prices.length;
        int[] minArray=new int[n];

        minArray[0]=prices[0];

        for(int i=1;i<n;i++){
            minArray[i]=Math.min(minArray[i-1],prices[i]);
        }

        int ans=Integer.MIN_VALUE;

        for(int i=1;i<n;i++){

            int profit=prices[i]-minArray[i-1];
            ans=Math.max(ans,profit);
        }

        if(ans<0){
            return 0;
        }
        return ans;
    }
}