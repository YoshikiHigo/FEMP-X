package unverified;

public class ClonePair12660 {

    boolean method1(String pWhat,String[] pInWhat){
      if (pWhat != null && pInWhat != null) {
        for (int i=0; i < pInWhat.length; i++) {
          if (pInWhat[i].toLowerCase().equals(pWhat.toLowerCase())) {
            return true;
          }
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
