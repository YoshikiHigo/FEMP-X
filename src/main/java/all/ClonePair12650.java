package all;

public class ClonePair12650 {

    boolean method1(String searchFor,String[] searchIn){
      if ((searchIn == null) || (searchFor == null))   return false;
      for (int i=0; i < searchIn.length; i++) {
        if (searchIn[i].equals(searchFor))     return true;
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
