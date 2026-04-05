package all;

public class ClonePair3571 {

    boolean method1(int[] a,int[] b){
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(int[] tuple1,int[] tuple2){
      int arity=tuple1.length;
      for (int i=0; i < arity; i++)   if (tuple1[i] != tuple2[i])   return false;
      return true;
    }
}
