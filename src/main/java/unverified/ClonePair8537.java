package unverified;

public class ClonePair8537 {

    boolean method1(StringBuffer buffer,String suffix){
      if (suffix.length() > buffer.length()) {
        return false;
      }
      int endIndex=suffix.length() - 1;
      int bufferIndex=buffer.length() - 1;
      while (endIndex >= 0) {
        if (buffer.charAt(bufferIndex) != suffix.charAt(endIndex)) {
          return false;
        }
        bufferIndex--;
        endIndex--;
      }
      return true;
    }

    boolean method2(StringBuffer buf,String strSuffix){
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
}
