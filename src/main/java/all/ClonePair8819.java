package all;

public class ClonePair8819 {

    boolean method1(String str,String op){
      if (str.length() >= op.length()) {
        for (int i=0; i <= str.length() - op.length(); i++) {
          if (i == (str.length() - op.length())) {
            if (str.substring(i).equals(op))         return true;
          }
     else       if (str.substring(i,op.length() + i).equals(op))       return true;
        }
      }
      return false;
    }

    boolean method2(String text,String prefix){
      int length=prefix.length();
      if (length > text.length())   return false;
      for (int i=0; i < length; i++) {
        char tc=Character.toLowerCase(text.charAt(i));
        char pc=Character.toLowerCase(prefix.charAt(i));
        if (tc != pc)     return false;
      }
      return true;
    }
}
