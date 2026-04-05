package all;

public class ClonePair8103 {

    boolean method1(String str1,String str2){
      int i=0;
      int j=0;
      char quote=0;
      for (; ; ) {
        char x, y;
        for (; ; ) {
          if (i >= str1.length()) {
            x=0;
            break;
          }
          x=str1.charAt(i++);
          if (quote != 0 || !Character.isWhitespace(x))       break;
        }
        for (; ; ) {
          if (j >= str2.length()) {
            y=0;
            break;
          }
          y=str2.charAt(j++);
          if (quote != 0 || !Character.isWhitespace(y))       break;
        }
        if (x != y)     return false;
        if (x == 0)     return true;
        if (x == '\'' || x == '\"') {
          if (quote == 0)       quote=x;
     else       if (x == quote)       quote=0;
        }
      }
    }

    boolean method2(String string,String test){
      if (test.length() > string.length())   return (false);
      if (test.equals("") && !string.equals(""))   return (false);
      for (int i=0; i < test.length(); i++) {
        if (Character.toLowerCase(string.charAt(i)) != Character.toLowerCase(test.charAt(i)))     return (false);
      }
      return (true);
    }
}
