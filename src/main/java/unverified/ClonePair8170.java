package unverified;

public class ClonePair8170 {

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

    boolean method2(String string1,String string2){
      if (string2.length() != string1.length())   return (false);
      for (int i=0; i < string2.length(); i++) {
        if (Character.toLowerCase(string1.charAt(i)) != Character.toLowerCase(string2.charAt(i)))     return (false);
      }
      return (true);
    }
}
