package unverified;

public class ClonePair3369 {

    boolean method1(int[] pattern1,int[] pattern2){
      int len=pattern1.length;
      for (int i=0; i < len; i++) {
        if (pattern1[i] != pattern2[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(int[] a,int[] b){
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }
}
