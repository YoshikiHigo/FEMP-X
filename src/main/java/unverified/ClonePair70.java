package unverified;

public class ClonePair70 {

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

    boolean method2(StringBuilder sb,String terminator){
      if (sb.length() < terminator.length()) {
        return false;
      }
      int start=sb.length() - terminator.length();
      for (int i=0; i < terminator.length(); i++) {
        if (sb.charAt(start + i) != terminator.charAt(i)) {
          return false;
        }
      }
      return true;
    }
}
