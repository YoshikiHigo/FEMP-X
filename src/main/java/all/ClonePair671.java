package all;

public class ClonePair671 {

    boolean method1(byte[] array1,byte[] array2){
      if (array1 == null && array2 == null)   return true;
      if (array1 == null && array2 != null)   return false;
      if (array1 != null && array2 == null)   return false;
      if (array1.length != array2.length) {
        System.out.println("diff length, array1 " + array1.length + ", array2 "+ array2.length);
        return false;
      }
      for (int i=0; i < array1.length; i++) {
        if (array1[i] != array2[i]) {
          System.out.println("diff byte at " + i);
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] a,byte[] a2){
      if (a == a2)   return true;
      if (a == null || a2 == null)   return false;
      int length=a.length;
      if (a2.length != length)   return false;
      for (int i=0; i < length; i++)   if (a[i] != a2[i])   return false;
      return true;
    }
}
