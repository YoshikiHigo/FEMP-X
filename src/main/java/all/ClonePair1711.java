package all;

public class ClonePair1711 {

    boolean method1(byte[] x,byte[] y){
      if (x == null || y == null)   return false;
      if (x.length != y.length)   return false;
      for (int i=0; i < x.length; i++) {
        if (x[i] != y[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] array1,byte[] array2){
      boolean compareresult=false;
      if ((array1 != null) && (array2 != null) && (array1.length == array2.length)) {
        compareresult=true;
        for (int i=0; i < array1.length; i++) {
          if (array1[i] != array2[i]) {
            compareresult=false;
            break;
          }
        }
      }
      return compareresult;
    }
}
