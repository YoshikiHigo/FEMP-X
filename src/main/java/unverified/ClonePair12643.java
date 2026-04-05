package unverified;

public class ClonePair12643 {

    boolean method1(String s,String[] sa){
      if (sa != null && s != null) {
        for (int i=0; i < sa.length; i++) {
          String string=sa[i];
          if (s.trim().compareTo(string.trim()) == 0)       return true;
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
