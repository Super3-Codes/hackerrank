 public static List<Integer> countingSort(List<Integer> arr) {

    List<Integer> frequency = new ArrayList<>(Collections.nCopies(100, 0));
    for(int currentValue : arr){
        
        frequency.set(currentValue, frequency.get(currentValue)+1);
    }
    return frequency;
    }
