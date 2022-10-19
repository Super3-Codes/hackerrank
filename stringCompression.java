 public int compress(char[] chars) {
        int index = 0, count = 0;
        for (int i = 0; i < chars.length; i++) {
            count++;
            if (i+1 == chars.length || chars[i] != chars[i+1]) {
                chars[index++] = chars[i];
                if (count != 1) {
                    for (char c : Integer.toString(count).toCharArray()) {
                        chars[index++] = c;
                    }
                }
                count = 0;
            }
        }
        return index;
        
    }
