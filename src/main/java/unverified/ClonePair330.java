package unverified;

public class ClonePair330 {

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

    boolean method2(byte[] acB,byte[] newAC){
      if (acB.length != newAC.length) {
        return false;
      }
      for (int i=0; i < acB.length; i++) {
        if (acB[i] != newAC[i]) {
          return false;
        }
     else {
          break;
        }
      }
      return true;
    }
}
