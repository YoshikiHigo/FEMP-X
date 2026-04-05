package all;

public class ClonePair1884 {

    boolean method1(byte[] a,byte[] a2){
      if (a == a2)   return true;
      if (a == null || a2 == null)   return false;
      int length=a.length;
      if (a2.length != length)   return false;
      for (int i=0; i < length; i++)   if (a[i] != a2[i])   return false;
      return true;
    }

    boolean method2(byte[] array1,byte[] array2){
      if (array1 == null || array1.length == 0) {
        return array2 == null || array2.length == 0;
      }
      if (array2 == null || array1.length != array2.length) {
        return false;
      }
      for (int i=array1.length - 1; i >= 0; i--) {
        if (array1[i] != array2[i]) {
          return false;
        }
      }
      return true;
    }
}
