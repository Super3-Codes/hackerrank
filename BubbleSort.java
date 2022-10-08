 public static void countSwaps(List<Integer> a) {
    // Write your code here
    int count = 0;
    int firstElement = 0;
    int lastElement = 0;
    for(int i = 0; i < a.size(); i++){
        for(int j = 0; j < a.size() -1; j++){
            if(a.get(j) > a.get(j+1)){
                count++;
                int temp = a.get(j);
                a.set(j,a.get(j+1));
                a.set(j+1, temp);
                
            }
        }
    }
    firstElement = a.get(0);
    lastElement = a.get(a.size()-1);
    System.out.println("Array is sorted in "+ count + " swaps.");
    System.out.println("First Element: " + firstElement);
    System.out.println("Last Element: " + lastElement);
    
    }

}
