package all;

public class ClonePair522 {

    boolean method1(byte[] s1,byte[] s2){
      int len=s1.length;
      for (int i=0; i < len; i++) {
        if (s1[i] != s2[i]) {
          return (false);
        }
      }
      return (true);
    }

    boolean method2(byte[] first,byte[] seond){
      boolean startsWith=true;
      int i=0;
      for (  byte toComp : first) {
        if (toComp != seond[i++]) {
          startsWith=false;
          break;
        }
      }
      return startsWith;
    }
}
