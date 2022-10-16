 public String sortSentence(String s) {
        String words[] = s.split(" ");
        String result [] = new String[words.length];
        String final_result = "";
        for(String word: words){
        int index = Character.getNumericValue(word.charAt(word.length()-1))-1;
            result[index] = word.substring(0,word.length()-1);
        }
        
        for(int i=0; i < result.length; i++){
            final_result += result[i];
            if (i != result.length-1)
                final_result += " ";
        }
        return final_result;
        
    }
