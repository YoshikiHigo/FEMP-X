package all;

public class ClonePair3608 {

    boolean method1(int[] lhs,int[] rhs){
      if (lhs == rhs)   return true;
      if (lhs.length != rhs.length)   return false;
      for (int ii=0; ii < lhs.length; ii++)   if (lhs[ii] != rhs[ii])   return false;
      return true;
    }

    boolean method2(int[] conf1,int[] conf2){
      if (conf1.length != conf2.length) {
        System.out.println("\nLength of two configurations are not the same, can not be compared!");
        return false;
      }
      boolean output=true;
      for (int i=0; i < conf1.length; i++) {
        if (conf1[i] != conf2[i]) {
          output=false;
          break;
        }
      }
      return (output);
    }
}
