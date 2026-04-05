package all;

public class ClonePair8294 {

    String method1(String string1,String string2){
      StringBuilder match=new StringBuilder();
      for (int i=0; i < string1.length(); i++) {
        if (string1.length() > i && string2.length() > i) {
          if (string1.charAt(i) == string2.charAt(i)) {
            match.append(string1.charAt(i));
          }
     else {
            break;
          }
        }
      }
      return match.toString();
    }

    String method2(String word1,String word2){
      for (int i=0; i < word1.length() && i < word2.length(); i++) {
        if (word1.charAt(i) != word2.charAt(i))     return word1.substring(0,i);
      }
      if (word1.length() < word2.length())   return word1;
     else   return word2;
    }
}
