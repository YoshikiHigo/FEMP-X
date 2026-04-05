package all;

public class ClonePair6064 {

    boolean method1(Object[] ar1,Object[] ar2){
      if (ar1 == null && ar2 == null)   return true;
      if (ar1 == null || ar2 == null)   return false;
      if (ar1.length != ar2.length)   return false;
      for (int i=0; i < ar1.length; i++) {
        if (ar1[i] == null) {
          if (ar2[i] == null)       continue;
          return false;
        }
     else     if (ar2[i] == null)     return false;
        if (!ar1[i].equals(ar2[i]))     return false;
      }
      return true;
    }

    boolean method2(Object[] o1,Object[] o2){
      if (o1 == null && o2 == null) {
        return true;
      }
     else   if (o1 == null || o2 == null) {
        return false;
      }
      if (o1.length != o2.length) {
        return false;
      }
      for (int i=0; i < o1.length; i++) {
        if (o1[i] != o2[i]) {
          return false;
        }
      }
      return true;
    }
}
