package all;

public class ClonePair12610 {

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

    boolean method2(String pWhat,String[] pInWhat){
      if (pWhat != null && pInWhat != null) {
        for (int i=0; i < pInWhat.length; i++) {
          if (pInWhat[i].toLowerCase().equals(pWhat.toLowerCase())) {
            return true;
          }
        }
      }
      return false;
    }
}
