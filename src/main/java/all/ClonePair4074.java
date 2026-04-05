package all;

public class ClonePair4074 {

    boolean method1(String[] left,String[] right){
      boolean result=left.length == right.length;
      if (result) {
        for (int i=0; i < left.length; i++) {
          result&=((left[i] == null && right[i] == null) || left[i] != null && left[i].equals(right[i]));
          if (!result) {
            break;
          }
        }
      }
      return result;
    }

    boolean method2(String[] test1,String[] test2){
      boolean isEqual=true;
      if (test1.length != test2.length) {
        isEqual=false;
      }
     else {
        for (int i=0; i < test1.length; i++) {
          if (test1[i] != null) {
            if (!test1[i].equals(test2[i])) {
              isEqual=false;
              break;
            }
          }
     else {
            if (test2[i] != null) {
              isEqual=false;
              break;
            }
          }
        }
      }
      return isEqual;
    }
}
