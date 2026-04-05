package unverified;

public class ClonePair12541 {

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

    boolean method2(String str){
      int begin=0;
      if (str == null || str.trim().equals("")) {
        return false;
      }
      str=str.trim();
      if (str.startsWith("+") || str.startsWith("-")) {
        if (str.length() == 1) {
          return false;
        }
        begin=1;
      }
      for (int i=begin; i < str.length(); i++) {
        if (!Character.isDigit(str.charAt(i))) {
          return false;
        }
      }
      return true;
    }
}
