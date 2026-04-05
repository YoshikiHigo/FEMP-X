package all;

public class ClonePair4071 {

    boolean method1(String[] one,String[] two){
      if ((one == null) && (two == null))   return true;
      if ((one == null) || (two == null))   return false;
      if (one.length != two.length)   return false;
      for (int i=0; i < one.length; i++) {
        if (!one[i].equals(two[i]))     return false;
      }
      return true;
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
