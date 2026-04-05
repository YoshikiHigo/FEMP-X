package all;

public class ClonePair3521 {

    boolean method1(int[] int1,int[] int2){
      boolean result=false;
      if (int1 == null || int2 == null) {
        return result;
      }
      if (int1.length == int2.length) {
        result=true;
        int i=0;
        while ((i < int1.length) & result) {
          result=((int1[i] == int2[i]));
          i++;
        }
      }
      return result;
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
