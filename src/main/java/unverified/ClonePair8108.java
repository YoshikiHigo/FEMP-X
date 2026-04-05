package unverified;

public class ClonePair8108 {

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

    boolean method2(String s1,String s2){
      if (s1.length() < s2.length())   return false;
      for (int i=0; i < s2.length(); i++) {
        char c1=s1.charAt(i), c2=s2.charAt(i);
        if (c1 != c2 && Character.toLowerCase(c2) != c1 && Character.toUpperCase(c2) != c1)     return false;
      }
      return true;
    }
}
