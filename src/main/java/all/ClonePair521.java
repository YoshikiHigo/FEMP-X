package all;

public class ClonePair521 {

    boolean method1(byte[] s1,byte[] s2){
      int len=s1.length;
      for (int i=0; i < len; i++) {
        if (s1[i] != s2[i]) {
          return (false);
        }
      }
      return (true);
    }

    boolean method2(byte[] fixed,byte[] temp){
      for (int i=0; i < fixed.length; i++) {
        if (temp[i] != fixed[i])     return false;
      }
      return true;
    }
}
