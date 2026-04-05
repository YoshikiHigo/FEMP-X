package all;

public class ClonePair8536 {

    boolean method1(StringBuffer buf,String s){
      int iBuf=buf.length();
      int iS=s.length();
      while (--iS >= 0 && --iBuf >= 0 && buf.charAt(iBuf) == s.charAt(iS)) {
      }
      return iS < 0;
    }

    boolean method2(StringBuffer buffer,String suffix){
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
}
