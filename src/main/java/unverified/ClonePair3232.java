package unverified;

public class ClonePair3232 {

    boolean method1(int[] a,int[] b){
      if (a.length != b.length) {
        return (false);
      }
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i]) {
          return (false);
        }
      }
      return (true);
    }

    boolean method2(int[] a,int[] b){
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; i++)   if (a[i] != b[i])   return false;
      return true;
    }
}
