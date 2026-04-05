package all;

public class ClonePair12536 {

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

    boolean method2(String doubleString){
      if (doubleString == null || doubleString.length() <= 0) {
        return false;
      }
      for (int i=0; i < doubleString.length(); i++) {
        char oneChar=doubleString.charAt(i);
        if (!Character.isDigit(oneChar) && oneChar != ',' && oneChar != '-' && oneChar != '.') {
          return false;
        }
      }
      return true;
    }
}
