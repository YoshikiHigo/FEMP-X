package all;

public class ClonePair679 {

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

    boolean method2(byte[] data1,byte[] data2){
      if (data1 == data2)   return true;
      if (data1 == null || data2 == null)   return false;
      if (data1.length != data2.length)   return false;
      for (int i=0; i < data1.length; i++) {
        if (data1[i] != data2[i])     return false;
      }
      return true;
    }
}
