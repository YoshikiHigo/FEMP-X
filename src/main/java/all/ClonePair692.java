package all;

public class ClonePair692 {

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

    boolean method2(byte[] b1,byte[] b2){
      if (b1 == b2) {
        return true;
      }
      if (b1 == null || b2 == null) {
        return (b1 == b2);
      }
      if (b1.length != b2.length) {
        return false;
      }
      int result=0;
      for (int i=0; i < b1.length; i++) {
        result|=(b1[i] ^ b2[i]);
      }
      return (result == 0) ? true : false;
    }
}
