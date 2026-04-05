package all;

public class ClonePair2715 {

    boolean method1(boolean[] v1,boolean[] v2,int len){
      for (int i=0; i < len; i++)   if (v1[i] != v2[i])   return false;
      return true;
    }

    boolean method2(boolean[] a1,boolean[] a2,int arity){
      for (int i=0; i < arity; i++) {
        if (a1[i] != a2[i])     return false;
      }
      return true;
    }
}
