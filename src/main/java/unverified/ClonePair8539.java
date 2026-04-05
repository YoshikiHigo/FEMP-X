package unverified;

public class ClonePair8539 {

    boolean method1(StringBuffer buf,String strSuffix){
      if (buf.length() < strSuffix.length()) {
        return false;
      }
      int offset=buf.length() - strSuffix.length();
      for (int i=0; i < strSuffix.length(); i++) {
        if (strSuffix.charAt(i) != buf.charAt(offset + i)) {
          return false;
        }
      }
      return true;
    }

    boolean method2(StringBuffer line,String string){
      if (line.length() < string.length()) {
        return false;
      }
      for (int i=0; i < string.length(); i++) {
        if (line.charAt(i) != string.charAt(i)) {
          return false;
        }
      }
      return true;
    }
}
