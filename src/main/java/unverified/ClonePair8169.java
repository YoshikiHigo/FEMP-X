package unverified;

public class ClonePair8169 {

    boolean method1(String first,String second){
      boolean result=false;
      if (first.length() == 0) {
        return second.length() == 0;
      }
      if (second.length() == 0) {
        return first.length() == 0;
      }
      if (first.charAt(0) == '+') {
        first=first.substring(1);
      }
      if (second.charAt(0) == '+') {
        second=second.substring(1);
      }
      try {
        double d1=Double.parseDouble(first);
        double d2=Double.parseDouble(second);
        if (d1 == d2) {
          result=true;
        }
      }
     catch (  NumberFormatException e) {
        result=first.equals(second);
      }
      return result;
    }

    boolean method2(String string,String test){
      if (test.length() > string.length())   return (false);
      if (test.equals("") && !string.equals(""))   return (false);
      for (int i=0; i < test.length(); i++) {
        if (Character.toLowerCase(string.charAt(i)) != Character.toLowerCase(test.charAt(i)))     return (false);
      }
      return (true);
    }
}
