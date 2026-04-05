package unverified;

public class ClonePair13408 {

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

    boolean method2(byte a1[],byte a2[]){
      if (a1.length != a2.length) {
        return (false);
      }
     else {
        boolean result=true;
        for (int ii=0; ii < a1.length; ii++) {
          if (a1[ii] != a2[ii])       result=false;
        }
        return (result);
      }
    }
}
