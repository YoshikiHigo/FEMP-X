package all;

public class ClonePair1472 {

    boolean method1(byte[] b1,byte[] b2){
      boolean ret=b1.length == b2.length;
      for (int i=0; ret && i < b1.length; i++) {
        ret=b1[i] == b2[i];
      }
      return ret;
    }

    boolean method2(byte[] a,byte[] b){
      int size;
      if ((size=a.length) != b.length)   return false;
      for (int i=0; i < size; i++)   if (a[i] != b[i])   return false;
      return true;
    }
}
