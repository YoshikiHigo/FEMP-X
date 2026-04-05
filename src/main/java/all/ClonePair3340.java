package all;

public class ClonePair3340 {

    boolean method1(int[] a1,int[] a2){
      if (a1.length != a2.length) {
        return false;
      }
      for (int i=0; i < a1.length; i++) {
        if (a1[i] != a2[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(int[] a1,int[] a2){
      if (a1.length != a2.length)   return false;
      for (int i=0; i < a1.length; i++)   if (Character.toLowerCase((char)a1[i]) != Character.toLowerCase((char)a2[i]))   return false;
      return true;
    }
}
