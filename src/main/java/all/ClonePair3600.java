package all;

public class ClonePair3600 {

    boolean method1(int[] test1,int[] test2){
      boolean isEqual=true;
      if (test1.length != test2.length) {
        isEqual=false;
      }
     else {
        for (int i=0; i < test1.length; i++) {
          if (test1[i] != test2[i]) {
            isEqual=false;
            break;
          }
        }
      }
      return isEqual;
    }

    boolean method2(int[] a1,int[] a2){
      if (a1.length != a2.length)   return false;
      for (int i=0; i < a1.length; i++)   if (Character.toLowerCase((char)a1[i]) != Character.toLowerCase((char)a2[i]))   return false;
      return true;
    }
}
