package all;

public class ClonePair10362 {

    boolean method1(CharSequence text1,CharSequence text2){
      if (text1 == null && text2 == null)   return true;
     else   if (text1 == null || text2 == null)   return false;
     else {
        if (text1.length() != text2.length())     return false;
        for (int i=0; i < text1.length(); i++) {
          if (text1.charAt(i) != text2.charAt(i))       return false;
        }
      }
      return true;
    }

    boolean method2(CharSequence string1,CharSequence string2){
      if ((string1 == null) && (string2 == null)) {
        return true;
      }
      if ((string1 == null) && (string2 != null)) {
        return false;
      }
      if ((string2 == null) && (string1 != null)) {
        return false;
      }
      if (string1.length() != string2.length()) {
        return false;
      }
      for (int i=0; i < string1.length(); i++) {
        if (string1.charAt(i) != string2.charAt(i)) {
          return false;
        }
      }
      return true;
    }
}
