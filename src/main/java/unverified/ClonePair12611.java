package unverified;

public class ClonePair12611 {

    boolean method1(String str,String[] array){
      if (str == null || array == null) {
        return false;
      }
      for (  String a : array) {
        if (a.equals(str)) {
          return true;
        }
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
