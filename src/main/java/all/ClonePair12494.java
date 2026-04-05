package all;

public class ClonePair12494 {

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

    boolean method2(String INT){
      if (INT == null)   return false;
      if (INT.length() == 0)   return false;
      int i=0;
      if (INT.charAt(0) == '-')   if (INT.length() > 1)   i++;
     else   return false;
      for (; i < INT.length(); i++)   if (!Character.isDigit(INT.charAt(i)))   return false;
      return true;
    }
}
