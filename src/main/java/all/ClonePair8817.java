package all;

public class ClonePair8817 {

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

    boolean method2(String text,String suffix){
      int length=suffix.length();
      int offset=text.length() - length;
      if (offset < 0)   return false;
      for (int i=0; i < length; i++) {
        char tc=Character.toLowerCase(text.charAt(offset + i));
        char pc=Character.toLowerCase(suffix.charAt(i));
        if (tc != pc)     return false;
      }
      return true;
    }
}
