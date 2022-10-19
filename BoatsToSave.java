 public int numRescueBoats(int[] people, int limit) {
       
        Arrays.sort(people);//sort
        
        int i = 0, 
        j = people.length - 1;//set J to the last element in the array 
        int ans = 0;

        while (i <= j) {
            ans++;
            if (people[i] + people[j] <= limit)
                i++;
            j--;
        }

        return ans;
    }
