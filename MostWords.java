/Наши решения
public int mostWordsFound(String[] sentences) {

        int ans = -1;
        for (String sentence : sentences) {
            if (sentence.split(" ").length > ans) {
                ans = sentence.split(" ").length;
            }
        }
        return ans;
    }
////////////////////////////////
//////////////Лучшее по скорости
class Solution {
    public static int words(String str){
        String str1=str.trim();
        int count=0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)==' ')
                count++;
        }
        return count;
    }
    public int mostWordsFound(String[] sentences) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++){
            max=Math.max(max,words(sentences[i]));
        }
        return max+1;
    }
}
////////////////////////////////////
/////////Лучшее по  памяти 
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i = 0; i<sentences.length; i++) {
            max = Math.max(max, wordCount(sentences[i]));
        }
        System.gc(); 
        return max;
        
    }

    private int wordCount(String sentence) {
        int count = 1;
        for(int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) != ' ') continue;
            count++;
        }
        return count;
    }
}
