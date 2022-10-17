  public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        
        
        for (int num : nums){
            rightSum = rightSum + num;
        }
        
        for(int i = 0; i<nums.length; i++){
            
            int currentValue = nums[i];
            rightSum = rightSum - currentValue;
            
            if(rightSum == leftSum){
                return i;
            }else{
                leftSum = leftSum + currentValue;
            }
            
        }
        
        return -1;
    }
