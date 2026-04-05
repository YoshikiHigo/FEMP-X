package all;

public class ClonePair1009 {

    boolean method1(byte[] a,byte[] b){
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i]) {
          return false;
        }
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
