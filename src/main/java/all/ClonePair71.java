package all;

public class ClonePair71 {

    boolean method1(StringBuilder sb,String terminator){
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
