package all;

public class ClonePair3295 {

    boolean method1(int[] xs,int[] ys){
      if (xs.length != ys.length)   return false;
      for (int i=xs.length - 1; i >= 0; i--) {
        if (xs[i] != ys[i])     return false;
      }
      return true;
    }

    boolean method2(int[] lhs,int[] rhs){
      if (lhs == rhs)   return true;
      if (lhs.length != rhs.length)   return false;
      for (int ii=0; ii < lhs.length; ii++)   if (lhs[ii] != rhs[ii])   return false;
      return true;
    }
}
