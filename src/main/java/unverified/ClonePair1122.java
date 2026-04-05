package unverified;

public class ClonePair1122 {

    boolean method1(byte[] a1,byte[] a2){
      if (a1 == a2)   return true;
      if (null == a1 || null == a2)   return false;
      if (a1.length == a2.length) {
        int i=a1.length;
        while (--i >= 0)     if (a1[i] != a2[i])     return false;
        return true;
      }
      return false;
    }

    boolean method2(byte[] a,byte[] b){
      if (null == a)   return (null == b);
     else   if (null == b)   return false;
     else   if (a.length == b.length) {
        for (int cc=0, count=a.length; cc < count; cc++) {
          if (a[cc] != b[cc])       return false;
        }
        return true;
      }
     else   return false;
    }
}
