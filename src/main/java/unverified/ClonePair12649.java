package unverified;

public class ClonePair12649 {

    boolean method1(String s,String[] sa){
      if (sa != null && s != null) {
        for (int i=0; i < sa.length; i++) {
          String string=sa[i];
          if (s.trim().toLowerCase().compareTo(string.trim().toLowerCase()) == 0)       return true;
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
