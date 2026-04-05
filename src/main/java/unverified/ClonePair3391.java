package unverified;

public class ClonePair3391 {

    boolean method1(int[] int1,int[] int2){
      if (int1 == null && int2 == null) {
        return true;
      }
     else   if (int1 == null || int2 == null) {
        return false;
      }
      if (int1.length != int2.length) {
        return false;
      }
      for (int i=0; i < int1.length; i++) {
        if (int1[i] != int2[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(int[] a,int[] a2){
      if (a == a2)   return true;
      if (a == null || a2 == null)   return false;
      int length=a.length;
      if (a2.length != length)   return false;
      for (int i=0; i < length; i++)   if (a[i] != a2[i])   return false;
      return true;
    }
}
