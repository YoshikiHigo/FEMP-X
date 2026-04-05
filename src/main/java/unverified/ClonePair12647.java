package unverified;

public class ClonePair12647 {

    boolean method1(String s,String[] sa){
      if (sa != null && s != null) {
        for (int i=0; i < sa.length; i++) {
          String string=sa[i];
          if (s.trim().toLowerCase().compareTo(string.trim().toLowerCase()) == 0)       return true;
        }
      }
      return false;
    }

    boolean method2(String searchFor,String[] searchIn){
      if ((searchIn == null) || (searchFor == null))   return false;
      for (int i=0; i < searchIn.length; i++) {
        if (searchIn[i].equals(searchFor))     return true;
      }
      return false;
    }
}
