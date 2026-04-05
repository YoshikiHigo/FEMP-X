package all;

public class ClonePair3966 {

    int method1(byte[] left,byte[] right){
      if (null != left) {
        if (null == right) {
          return (1);
        }
     else {
          int leftLength=left.length;
          int rightLength=right.length;
          if (leftLength < rightLength) {
            return (-1);
          }
     else       if (leftLength > rightLength) {
            return (1);
          }
     else {
            for (int i=0; i < leftLength; ++i) {
              short leftSubI=(short)(left[i] & 0xff);
              short rightSubI=(short)(right[i] & 0xff);
              if (leftSubI < rightSubI) {
                return (-1);
              }
     else           if (leftSubI > rightSubI) {
                return (1);
              }
            }
          }
        }
      }
     else {
        if (null != right)     return (-1);
     else     return (0);
      }
      return (0);
    }

    int method2(byte[] arr1,byte[] arr2){
      if (arr1 == null) {
        if (arr2 == null) {
          return 0;
        }
     else {
          return -1;
        }
      }
     else {
        if (arr2 == null) {
          return 1;
        }
     else {
          int iCommonPrefixLength=arr1.length;
          int iResult=-1;
          int iCount;
          if (iCommonPrefixLength == arr2.length) {
            iResult=0;
          }
     else       if (iCommonPrefixLength > arr2.length) {
            iCommonPrefixLength=arr2.length;
            iResult=1;
          }
          for (iCount=0; iCount < iCommonPrefixLength && (arr1[iCount] == arr2[iCount]); iCount++) {
          }
          if (iCount < iCommonPrefixLength) {
            if (arr1[iCount] < arr2[iCount]) {
              iResult=-1;
            }
     else {
              iResult=1;
            }
          }
          return iResult;
        }
      }
    }
}
