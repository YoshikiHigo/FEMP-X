package all;

public class ClonePair3422 {

    boolean method1(int[] a,int[] b){
      if (a == b)   return true;
      if (a == null || b == null)   return false;
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i])     return false;
      }
      return true;
    }

    boolean method2(int[] a,int[] b){
      if (a == b)   return true;
      if (a == null || b == null)   return false;
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; i++)   if (a[i] != b[i])   return false;
      return true;
    }
}
