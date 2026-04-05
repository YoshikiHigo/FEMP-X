package unverified;

public class ClonePair3323 {

    boolean method1(int[] o1,int[] o2){
      if (o1.length != o2.length) {
        return false;
      }
     else {
        for (int i=0; i < o1.length; i++) {
          if (o1[i] != o2[i]) {
            return false;
          }
        }
        return true;
      }
    }

    boolean method2(int[] lhs,int[] rhs){
      if (lhs == rhs)   return true;
      if (lhs.length != rhs.length)   return false;
      for (int ii=0; ii < lhs.length; ii++)   if (lhs[ii] != rhs[ii])   return false;
      return true;
    }
}
