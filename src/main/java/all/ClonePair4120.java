package all;

public class ClonePair4120 {

    @SuppressWarnings("null") boolean method1(String[] s1,String[] s2){
      if (s1 == null && s2 == null)   return true;
      if (s1 == null && s2 != null)   return false;
      if (s1 != null && s2 == null)   return false;
      if (s1.length != s2.length)   return false;
      for (int i=0; i < s1.length; i++) {
        if (!s1[i].equals(s2[i]))     return false;
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
