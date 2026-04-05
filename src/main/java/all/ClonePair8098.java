package all;

public class ClonePair8098 {

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
      int len1=s1.length(), len2=s2.length();
      int len=len1 < len2 ? len1 : len2;
      if (len2 > len1 + 1 || len1 > len2 + 1)   return false;
      for (int i=0; i < len; i++) {
        if (s1.charAt(i) != s2.charAt(i))     return false;
      }
      if (len1 > len2 && s1.charAt(len1 - 1) != ' ' || len1 < len2 && s2.charAt(len2 - 1) != ' ')   return false;
      return true;
    }
}
