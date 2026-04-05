package unverified;

public class ClonePair12631 {

    boolean method1(String str,String[] strs){
      if (strs == null || str == null)   return false;
      for (int i=0; i < strs.length; i++) {
        if (strs[i].equals(str))     return true;
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
