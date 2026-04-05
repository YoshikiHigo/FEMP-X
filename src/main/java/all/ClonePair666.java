package all;

public class ClonePair666 {

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

    boolean method2(byte[] key1,byte[] key2){
      if (key1 == null)   return (key2 == null);
      if (key2 == null)   return false;
      if (key1.length != key2.length)   return false;
      for (int i=0; i < key1.length; i++)   if (key1[i] != key2[i])   return false;
      return true;
    }
}
