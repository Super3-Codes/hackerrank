 public static void insertionSort1(int n, List<Integer> arr) {
    // Write your code here
    int e = arr.get(arr.size()-1);
    for(int i = n - 2 ; i >= 0; i--){
        
        int currentValue = arr.get(i);
        if(currentValue > e || currentValue == e){
             if(i == 0 && currentValue > e){
                arr.set(i+1, currentValue);
                print(arr);
                arr.set(i, e);
                print(arr);
                break;
            }
            arr.set(i+1, currentValue);
            print(arr);
           
        }else if(currentValue < e){
             arr.set(i+1,e);
             print(arr);
             break;
        }
    }
   
    }
    
    public static void print(List<Integer> arr){
        String string = arr.toString()
        .replace(",", "")
        .replace("[", "")
        .replace("]", "");
        System.out.println(string);
    }

}
