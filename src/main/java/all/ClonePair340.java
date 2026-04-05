package all;

public class ClonePair340 {

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

    boolean method2(byte[] d1,byte[] d2){
      if (d1.length != d2.length) {
        return false;
      }
      for (int i=0; i < d1.length; i++) {
        if (d1[i] != d2[i])     return false;
      }
      return true;
    }
}
