package unverified;

public class ClonePair13409 {

    boolean method1(byte a[],byte b[]){
      if (a.length != b.length) {
        return false;
      }
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte digest1[],byte digest2[]){
      if (digest1.length != digest2.length)   return false;
      for (int i=0; i < digest1.length; i++)   if (digest1[i] != digest2[i])   return false;
      return true;
    }
}
