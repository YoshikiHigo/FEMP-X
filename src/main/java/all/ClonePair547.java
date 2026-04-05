package all;

public class ClonePair547 {

    boolean method1(byte[] arr1,byte[] arr2){
      if (arr1 == null || arr2 == null)   return arr1 == arr2;
      if (arr1.length != arr2.length)   return false;
      for (int i=0; i < arr1.length; i++) {
        if (arr1[i] != arr2[i])     return false;
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
