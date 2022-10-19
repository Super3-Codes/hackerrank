 public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
         int ans1=firstLen(nums,firstLen,secondLen);
        int ans2=firstLen(nums,secondLen,firstLen);
        int ans=Math.max(ans1,ans2);
        return ans;
    }
    public int firstLen(int nums[],int x,int y)
    {
        int dp1[]=new int[nums.length];
        int dp2[]=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            
            if(i<x)
            {
               sum+=nums[i];
                dp1[i]=sum;
            }
            else
            {
                sum+=nums[i]-nums[i-x];
                dp1[i]=Math.max(dp1[i-1],sum);
            }
        }
        sum=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(i>=nums.length-y)
            {
               sum+=nums[i];
                dp2[i]=sum;
            }
            else
            {
                sum+=nums[i]-nums[i+y];
                dp2[i]=Math.max(sum,dp2[i+1]);
            }
        }
        int ans=Integer.MIN_VALUE;
        for(int i=x-1;i<nums.length-y;i++)
        {
            int s=dp1[i]+dp2[i+1];
            ans=Math.max(ans,s);
        }
        return ans;
    
    }
