package all;

public class ClonePair8410 {

    String method1(String pattern,int[] indexRef){
      StringBuffer buf=new StringBuffer();
      int i=indexRef[0];
      int length=pattern.length();
      char c=pattern.charAt(i);
      if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
        buf.append(c);
        while (i + 1 < length) {
          char peek=pattern.charAt(i + 1);
          if (peek == c) {
            buf.append(c);
            i++;
          }
     else {
            break;
          }
        }
      }
     else {
        buf.append('\'');
        boolean inLiteral=false;
        for (; i < length; i++) {
          c=pattern.charAt(i);
          if (c == '\'') {
            if (i + 1 < length && pattern.charAt(i + 1) == '\'') {
              i++;
              buf.append(c);
            }
     else {
              inLiteral=!inLiteral;
            }
          }
     else       if (!inLiteral && (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z')) {
            i--;
            break;
          }
     else {
            buf.append(c);
          }
        }
      }
      indexRef[0]=i;
      return buf.toString();
    }

    String method2(String pattern,int[] indexRef){
      StringBuilder buf=new StringBuilder();
      int i=indexRef[0];
      int length=pattern.length();
      char c=pattern.charAt(i);
      if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
        buf.append(c);
        while (i + 1 < length) {
          char peek=pattern.charAt(i + 1);
          if (peek == c) {
            buf.append(c);
            i++;
          }
     else {
            break;
          }
        }
      }
     else {
        buf.append('\'');
        boolean inLiteral=false;
        for (; i < length; i++) {
          c=pattern.charAt(i);
          if (c == '\'') {
            if (i + 1 < length && pattern.charAt(i + 1) == '\'') {
              i++;
              buf.append(c);
            }
     else {
              inLiteral=!inLiteral;
            }
          }
     else       if (!inLiteral && (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z')) {
            i--;
            break;
          }
     else {
            buf.append(c);
          }
        }
      }
      indexRef[0]=i;
      return buf.toString();
    }
}
