package unverified;

public class ClonePair12544 {

    boolean method1(String ref){
      if (ref == null || ref.trim().length() == 0)   return (false);
      char c;
      for (int i=0; i < ref.length(); i++) {
        c=ref.charAt(i);
        if (!(c >= '0' && c <= '9')) {
          return (false);
        }
      }
      return true;
    }

    boolean method2(String s){
      try {
        if (s == null)     return false;
        int i=Integer.parseInt(s);
        if (i >= 0)     return true;
      }
     catch (  NumberFormatException e) {
      }
      return false;
    }
}
