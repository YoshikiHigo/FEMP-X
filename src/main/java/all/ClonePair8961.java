package all;

public class ClonePair8961 {

    String method1(StringBuffer buffer){
      if (buffer.length() > 0) {
        for (int n=buffer.length() - 1; n >= 0; n--) {
          if (buffer.charAt(n) == '\n') {
            buffer.setCharAt(n,' ');
          }
          char theChar=buffer.charAt(n);
          if (theChar == ' ') {
            if (n == buffer.length() - 1) {
              buffer.deleteCharAt(n);
            }
     else         if (buffer.charAt(n + 1) == ' ') {
              buffer.deleteCharAt(n);
            }
     else         if (n == 0) {
              buffer.deleteCharAt(n);
            }
          }
        }
      }
      return buffer.toString();
    }

    String method2(StringBuffer buffer){
      if (buffer.length() > 0) {
        for (int n=buffer.length() - 1; n >= 0; n--) {
          if (buffer.charAt(n) == '\n') {
            buffer.setCharAt(n,' ');
          }
          char theChar=buffer.charAt(n);
          if (theChar == ' ') {
            if (n == (buffer.length() - 1)) {
              buffer.deleteCharAt(n);
            }
     else         if (buffer.charAt(n + 1) == ' ') {
              buffer.deleteCharAt(n);
            }
     else         if (n == 0) {
              buffer.deleteCharAt(n);
            }
          }
        }
      }
      return buffer.toString();
    }
}
