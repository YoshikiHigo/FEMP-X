package unverified;

public class ClonePair4133 {

    boolean method1(String[] firstArray,String[] secondArray){
      boolean equal=true;
      if (firstArray != null) {
        if ((secondArray == null) || (firstArray.length != secondArray.length)) {
          equal=false;
        }
     else {
          for (int i=0; equal && i < firstArray.length; i++) {
            if (!firstArray[i].equals(secondArray[i])) {
              equal=false;
            }
          }
        }
      }
     else {
        equal=(secondArray == null);
      }
      return equal;
    }

    boolean method2(String[] arr1,String[] arr2){
      if (arr1 == null && arr2 == null) {
        return true;
      }
      if (arr1 == null || arr2 == null || arr1.length != arr2.length) {
        return false;
      }
      for (int i=0; i < arr1.length; i++) {
        if (!arr1[i].equals(arr2[i])) {
          return false;
        }
      }
      return true;
    }
}
