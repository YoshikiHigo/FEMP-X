package unverified;

public class ClonePair3348 {

    boolean method1(int[] mark1,int[] mark2){
      int m1=mark1.length;
      int m2=mark2.length;
      if (m1 != m2) {
        return false;
      }
     else {
        for (int i=0; i < m1; i++) {
          if ((int)(mark1[i]) != (int)(mark2[i])) {
            return false;
          }
        }
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
