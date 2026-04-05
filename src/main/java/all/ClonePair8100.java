package all;

public class ClonePair8100 {

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

    boolean method2(String string1,String string2){
      boolean stringsAreEqual=false;
      if (string1.length() == string2.length()) {
        int stringLength=string1.length();
        int pos;
        for (pos=0; pos < stringLength; ++pos) {
          if (Character.toUpperCase(string1.charAt(pos)) != Character.toUpperCase(string2.charAt(pos))) {
            break;
          }
        }
        if (pos == stringLength) {
          stringsAreEqual=true;
        }
      }
      return stringsAreEqual;
    }
}
