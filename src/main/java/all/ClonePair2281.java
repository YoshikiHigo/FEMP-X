package all;

public class ClonePair2281 {

    boolean method1(byte[] first,byte[] second){
      boolean out=first != null && second != null && first.length == second.length;
      for (int i=0; out && i < first.length; i++) {
        if (first[i] != second[i]) {
          out=false;
        }
      }
      return out;
    }

    boolean method2(byte[] a,byte[] b){
      if (a == b)   return true;
      if ((a == null) || (b == null))   return false;
      int i=a.length;
      if (b.length != i)   return false;
      while (--i >= 0)   if (a[i] != b[i])   return false;
      return true;
    }
}
