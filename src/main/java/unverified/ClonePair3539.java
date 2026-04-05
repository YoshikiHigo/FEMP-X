package unverified;

public class ClonePair3539 {

    boolean method1(int[] s0,int[] s1){
      if (s0 == null || s1 == null) {
        return false;
      }
      if (s0.length != s1.length) {
        return false;
      }
      for (int i=0; i < s0.length; i++) {
        if (s0[i] != s1[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(int[] arr1,int[] arr2){
      if ((arr1 == null) || (arr2 == null) || (arr1.length != arr2.length)) {
        return false;
      }
     else {
        int iCount;
        for (iCount=arr1.length - 1; iCount >= 0 && (arr1[iCount] == arr2[iCount]); iCount--) {
        }
        return (iCount < 0);
      }
    }
}
