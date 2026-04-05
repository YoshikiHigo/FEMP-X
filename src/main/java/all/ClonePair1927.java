package all;

public class ClonePair1927 {

    boolean method1(byte[] blob,byte[] sig){
      int n=sig.length;
      for (int i=0; i < n; i++) {
        if (blob[i] != sig[i]) {
          return false;
        }
      }
      return true;
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
