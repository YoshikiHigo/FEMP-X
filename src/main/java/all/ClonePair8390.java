package all;

public class ClonePair8390 {

    boolean method1(byte[] s1,byte[] s2,int n){
      int c=0;
      byte u1, u2;
      while (c < n) {
        u1=s1[c];
        u2=s2[c];
        if (u1 >= 'A')     u1=(byte)(u1 - 'A' + 'a');
        if (u2 >= 'A')     u2=(byte)(u2 - 'A' + 'a');
        if (u1 != u2) {
          return false;
        }
        c++;
      }
      return true;
    }

    boolean method2(byte[] a,byte[] b,int len){
      for (int i=0; i < len; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }
}
