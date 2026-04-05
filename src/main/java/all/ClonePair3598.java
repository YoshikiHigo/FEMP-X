package all;

public class ClonePair3598 {

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

    boolean method2(int[] a,int[] b){
      boolean result=false;
      if (a.length == b.length) {
        result=true;
        for (int i=0; i < a.length; i++) {
          if (a[i] != b[i]) {
            result=false;
            break;
          }
        }
      }
      return result;
    }
}
