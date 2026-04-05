package all;

public class ClonePair69 {

    boolean method1(StringBuilder sb,String str){
      int strLen=str.length();
      int bufferOffset=sb.length() - strLen;
      if (bufferOffset < 0)   return false;
      for (int i=0; i < strLen; i++) {
        char ch=str.charAt(i);
        if (ch != sb.charAt(bufferOffset + i)) {
          return false;
        }
      }
      return true;
    }

    boolean method2(StringBuilder sb,String s){
      int len=s.length();
      if (sb.length() < len) {
        return false;
      }
      for (int i=sb.length() - len, j=0; j < len; i++, j++) {
        if (sb.charAt(i) != s.charAt(j)) {
          return false;
        }
      }
      return true;
    }
}
