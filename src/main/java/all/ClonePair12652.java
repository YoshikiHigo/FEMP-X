package all;

public class ClonePair12652 {

    boolean method1(String searchFor,String[] searchIn){
      if ((searchIn == null) || (searchFor == null))   return false;
      for (int i=0; i < searchIn.length; i++) {
        if (searchIn[i].equals(searchFor))     return true;
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
