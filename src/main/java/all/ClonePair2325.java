package all;

public class ClonePair2325 {

    boolean method1(byte[] magic,byte[] buffer){
      for (int i=0; i < magic.length; i++)   if (buffer[i] != magic[i])   return false;
      return true;
    }

    boolean method2(byte[] a,byte[] b){
      for (int i=0; i != a.length; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }
}
