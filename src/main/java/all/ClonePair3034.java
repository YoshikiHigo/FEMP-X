package all;

public class ClonePair3034 {

    boolean method1(byte[] arr1,byte[] arr2){
      if (arr1.length == arr2.length) {
        for (int i=0; i < arr1.length; i++) {
          if (arr1[i] != arr2[i])       return false;
        }
      }
     else {
        return false;
      }
      return true;
    }

    boolean method2(byte[] first,byte[] second){
      boolean equal=first.length == second.length;
      for (int i=0; i < first.length && equal; i++) {
        equal=first[i] == second[i];
      }
      return equal;
    }
}
