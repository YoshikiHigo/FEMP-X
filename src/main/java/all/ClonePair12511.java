package all;

public class ClonePair12511 {

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

    boolean method2(String string){
      if (string == null)   return false;
      try {
        int val=Integer.parseInt(string);
        if (val < 0)     return false;
     else     return true;
      }
     catch (  NumberFormatException ex) {
        return false;
      }
    }
}
