package unverified;

public class ClonePair12634 {

    boolean method1(String str,String[] strs){
      if (strs == null || str == null)   return false;
      for (int i=0; i < strs.length; i++) {
        if (strs[i].equals(str))     return true;
      }
      return false;
    }

    boolean method2(String text,String[] arr){
      if (arr == null || text == null) {
        return false;
      }
      for (int i=0; i < arr.length; i++) {
        if (text.toUpperCase().equals(arr[i].toUpperCase())) {
          return true;
        }
      }
      return false;
    }
}
