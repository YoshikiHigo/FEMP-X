package unverified;

public class ClonePair8464 {

    Double method1(String s){
      if (s == null || s.length() == 0) {
        return null;
      }
      if (s.endsWith("(sec)")) {
        return Double.parseDouble(s.substring(0,s.length() - "(sec)".length()));
      }
     else {
        return Double.parseDouble(s);
      }
    }

    Double method2(String dValue){
      Double result=null;
      if (dValue != null && dValue.trim().length() > 0) {
        result=Double.valueOf(dValue);
      }
      return result;
    }
}
