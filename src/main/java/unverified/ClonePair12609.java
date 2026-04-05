package unverified;

public class ClonePair12609 {

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

    boolean method2(String s,String[] sa){
      if (sa != null && s != null) {
        for (int i=0; i < sa.length; i++) {
          String string=sa[i];
          if (s.trim().toLowerCase().compareTo(string.trim().toLowerCase()) == 0)       return true;
        }
      }
      return false;
    }
}
