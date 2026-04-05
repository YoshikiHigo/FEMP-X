package unverified;

public class ClonePair6604 {

    @SuppressWarnings("boxing") boolean method1(long[] a1,long[] a2){
      if (a1.length != a2.length)   return false;
      long[] aa2=new long[a2.length];
      System.arraycopy(a2,0,aa2,0,a2.length);
      for (  long o1 : a1) {
        boolean found=false;
        for (int i=0; i < aa2.length; i++) {
          if (o1 == aa2[i]) {
            long[] tmp=new long[aa2.length - 1];
            if (i > 0)         System.arraycopy(aa2,0,tmp,0,i);
            if (i < tmp.length)         System.arraycopy(aa2,i + 1,tmp,i,tmp.length - i);
            aa2=tmp;
            found=true;
            break;
          }
        }
        if (!found)     return false;
      }
      return aa2.length == 0;
    }

    boolean method2(long[] a,long[] b){
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i])     return false;
      }
      return true;
    }
}
