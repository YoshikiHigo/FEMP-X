package all;

public class ClonePair1175 {

    boolean method1(byte[] a,byte[] b){
      for (int i=0; i < 16; i++) {
        if (a[i] != b[i + 4]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] a,byte[] b){
      for (int i=0; i < 16; i++)   if (a[i] != b[i + 4])   return false;
      return true;
    }
}
