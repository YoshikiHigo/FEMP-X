package all;

public class ClonePair12623 {

    String method1(String s1,String s2){
      int i, l1, l2;
      l1=s1.length();
      l2=s2.length();
      for (i=0; i < l1 && i < l2; i++) {
        if (s1.charAt(i) != s2.charAt(i))     break;
      }
      return (s1.substring(0,i));
    }

    String method2(String word1,String word2){
      for (int i=0; i < word1.length() && i < word2.length(); i++) {
        if (word1.charAt(i) != word2.charAt(i))     return word1.substring(0,i);
      }
      if (word1.length() < word2.length())   return word1;
     else   return word2;
    }
}
