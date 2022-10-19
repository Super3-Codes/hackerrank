public int longestMountain(int[] arr) {
        int ans=0;
        int n=arr.length;
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                int j=i;
                int count=1;
               
                while(j>0 && arr[j]>arr[j-1]){
                    j--;
                    count++;
                }
                j=i;
                while(j<n-1 && arr[j]>arr[j+1]){
                    j++;
                    count++;
                }
                ans=Math.max(ans,count);
            }
        
        }
        return ans;
}
