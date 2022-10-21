 public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        int length = words.length-1;
        String word = words[length];
        int result = 0;
        for (char c : word.toCharArray()){
            result++;
        }
        return result;
    }
