package unverified;

public class ClonePair10728 {

    int method1(String word1,String word2){
      if (word1.length() > 3 && word2.length() > 3) {
        int minLen=Math.min(word1.length(),word2.length());
        word1=word1.substring(0,minLen - 3);
        word2=word2.substring(0,minLen - 3);
      }
      return word1.compareTo(word2);
    }

    int method2(String s1,String s2){
      if (s1.length() > s2.length()) {
        if (s1.startsWith(s2) && s2.length() > 1)     return 0;
      }
     else {
        if (s2.startsWith(s1) && s1.length() > 1)     return 0;
      }
      return s1.compareTo(s2);
    }
}
