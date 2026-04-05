package unverified;

public class ClonePair8172 {

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

    boolean method2(String s1,String s2){
      if (s1.length() != s2.length())   return false;
      int result=0;
      for (int i=0; i < s1.length(); i++) {
        int c1=s1.charAt(i);
        int c2=s2.charAt(i);
        result|=(c1 ^ c2);
      }
      return result == 0;
    }
}
