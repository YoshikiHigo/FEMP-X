package all;

public class ClonePair337 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1.length != b2.length) {
        System.out.println("Length error: " + b1.length + " != "+ b2.length);
        return false;
      }
      for (int i=0; i < b1.length; i++) {
        if (b1[i] != b2[i]) {
          System.out.println("Value error at " + i + " : "+ b1[i]+ " != "+ b2[i]);
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
