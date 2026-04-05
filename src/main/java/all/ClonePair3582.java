package all;

public class ClonePair3582 {

    boolean method1(int[] size1,int[] size2){
      if ((size1 == null) || (size2 == null))   return false;
      if (size1.length != size2.length)   return false;
      for (int i=0; i < size1.length; i++) {
        if (size1[i] != size2[i])     return false;
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
