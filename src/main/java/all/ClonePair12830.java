package all;

public class ClonePair12830 {

    boolean method1(Class[] formals,Class[] actuals){
      if (formals.length != actuals.length)   return false;
      for (int i=0; i < formals.length; i++) {
        if (!(formals[i] == actuals[i])) {
          return false;
        }
      }
      return true;
    }

    boolean method2(Class[] p1,Class[] p2){
      if (p1.length == p2.length) {
        for (int i=0; i < p1.length; i++)     if (p1[i] != p2[i])     return false;
        return true;
      }
     else   return false;
    }
}
