package unverified;

public class ClonePair3272 {

    boolean method1(int[] a1,int[] a2){
      if ((a1 == null) || (a2 == null)) {
        return a1 == a2;
      }
      int nLength=a1.length;
      if (nLength != a2.length) {
        return false;
      }
      for (int i=0; i < nLength; i++) {
        if (a1[i] != a2[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(int[] pts1,int[] pts2){
      if (pts1 == pts2)   return true;
     else   if ((pts1 == null) || (pts2 == null))   return false;
     else   if (pts1.length != pts2.length)   return false;
     else {
        for (int i=0; i < pts1.length; i++) {
          if (pts1[i] != pts2[i])       return false;
        }
        return true;
      }
    }
}
