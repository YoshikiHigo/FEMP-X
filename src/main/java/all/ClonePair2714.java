package all;

public class ClonePair2714 {

    boolean method1(byte[] a,byte[] b){
      int aLength=a.length;
      if (aLength != b.length)   return false;
      for (int i=0; i < aLength; i++)   if (a[i] != b[i])   return false;
      return true;
    }

    boolean method2(byte[] array1,byte[] array2){
      if (array1.length != array2.length) {
        return false;
      }
      for (int i=0; i < array1.length; i++) {
        if (array1[i] != array2[i]) {
          return false;
        }
      }
      return true;
    }
}
