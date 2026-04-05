package unverified;

public class ClonePair1735 {

    boolean method1(byte[] buf,byte[] magic){
      boolean match=true;
      for (int i=0; i < magic.length; i++) {
        if (buf[i] != magic[i]) {
          match=false;
          break;
        }
      }
      return match;
    }

    boolean method2(byte[] source,byte[] match){
      int i=0;
      while (source.length < i || i < match.length) {
        if (source[i] != match[i]) {
          return false;
        }
        i++;
      }
      return true;
    }
}
