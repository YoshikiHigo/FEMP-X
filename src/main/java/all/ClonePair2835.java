package all;

public class ClonePair2835 {

    boolean method1(byte[] a,byte[] b){
      int size;
      if ((size=a.length) != b.length)   return false;
      for (int i=0; i < size; i++)   if (a[i] != b[i])   return false;
      return true;
    }

    boolean method2(byte[] b1,byte[] b2){
      boolean ret=false;
      if (b1.length == b2.length) {
        ret=true;
        for (int i=0; i < b1.length && ret; i++) {
          if (b1[i] != b2[i])       ret=false;
        }
      }
      return ret;
    }
}
