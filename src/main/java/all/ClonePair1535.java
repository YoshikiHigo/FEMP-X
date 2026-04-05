package all;

public class ClonePair1535 {

    boolean method1(byte[] src1,byte[] src2){
      for (int i=0; i < 16; i++) {
        if (src1[i] != src2[i])     return false;
      }
      return true;
    }

    boolean method2(byte[] a,byte[] b){
      int i;
      for (i=0; i < 16; ++i)   if (a[i] != b[i])   return false;
      return true;
    }
}
