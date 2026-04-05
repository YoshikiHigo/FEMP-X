package all;

public class ClonePair10680 {

    int method1(String firstString,String anotherString){
      int len1=firstString.length();
      int len2=anotherString.length();
      int n=Math.min(len1,len2);
      int i=0;
      int j=0;
      while (n-- != 0) {
        char c1=firstString.charAt(i++);
        char c2=anotherString.charAt(j++);
        if (c1 != c2) {
          return (c1 - c2);
        }
      }
      return (len1 - len2);
    }

    int method2(String word1,String word2){
      if (word1.length() > 3 && word2.length() > 3) {
        int minLen=Math.min(word1.length(),word2.length());
        word1=word1.substring(0,minLen - 3);
        word2=word2.substring(0,minLen - 3);
      }
      return word1.compareTo(word2);
    }
}
