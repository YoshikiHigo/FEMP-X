package all;

public class ClonePair12648 {

    boolean method1(String s,String[] sa){
      if (sa != null && s != null) {
        for (int i=0; i < sa.length; i++) {
          String string=sa[i];
          if (s.trim().toLowerCase().compareTo(string.trim().toLowerCase()) == 0)       return true;
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
