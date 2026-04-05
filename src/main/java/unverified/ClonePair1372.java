package unverified;

public class ClonePair1372 {

    boolean method1(byte[] cksum1,byte[] cksum2){
      if (cksum1 == cksum2)   return true;
      if ((cksum1 == null && cksum2 != null) || (cksum1 != null && cksum2 == null))   return false;
      if (cksum1.length != cksum2.length)   return false;
      for (int i=0; i < cksum1.length; i++)   if (cksum1[i] != cksum2[i])   return false;
      return true;
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
