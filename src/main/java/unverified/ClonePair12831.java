package unverified;

public class ClonePair12831 {

    boolean method1(Class[] formals,Class[] actuals){
      if (formals.length != actuals.length)   return false;
      for (int i=0; i < formals.length; i++) {
        if (!(formals[i] == actuals[i])) {
          return false;
        }
      }
      return true;
    }

    boolean method2(Class[] array1,Class[] array2){
      if (array1.length != array2.length) {
        return false;
      }
      for (int i=0; i < array1.length; i++) {
        if (array1[i] != array2[i]) {
          return false;
        }
      }
      return true;
    }
}
