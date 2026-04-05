package unverified;

public class ClonePair1339 {

    boolean method1(byte[] arr1,byte[] arr2){
      if (arr1.length != arr2.length) {
        return false;
      }
      for (int i=0; i != arr1.length; i++) {
        if (arr1[i] != arr2[i])     return false;
      }
      return true;
    }

    boolean method2(byte[] bytes1,byte[] bytes2){
      boolean result=(bytes1.length == bytes2.length);
      for (int i=0; i < bytes1.length && result; i++) {
        result=bytes1[i] == bytes2[i];
      }
      return result;
    }
}
