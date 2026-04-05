package all;

public class ClonePair1444 {

    boolean method1(byte[] b1,byte[] b2){
      boolean ret=b1.length == b2.length;
      for (int i=0; ret && i < b1.length; i++) {
        ret=b1[i] == b2[i];
      }
      return ret;
    }

    boolean method2(byte[] bytes1,byte[] bytes2){
      boolean result=(bytes1.length == bytes2.length);
      for (int i=0; i < bytes1.length && result; i++) {
        result=bytes1[i] == bytes2[i];
      }
      return result;
    }
}
