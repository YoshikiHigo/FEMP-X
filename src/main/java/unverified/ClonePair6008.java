package unverified;

public class ClonePair6008 {

    boolean method1(Object[] o1,Object[] o2){
      if (o1 == null || o2 == null || o1.length != o2.length)   return false;
      if (o1.length == 1)   return o1[0].equals(o2[0]);
      iloop:   for (int i=0, len=o1.length; i < len; i++) {
        for (int j=0; j < len; j++) {
          if (o1[i].equals(o2[j]))       continue iloop;
        }
        return false;
      }
      return true;
    }

    boolean method2(Object[] a,Object[] b){
      if (a == null || b == null)   return false;
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; i++) {
        if (!(a[i].equals(b[i])))     return false;
      }
      return true;
    }
}
