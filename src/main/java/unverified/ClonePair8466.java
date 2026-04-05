package unverified;

public class ClonePair8466 {

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

    Double method2(String token){
      if (token != null && !"".equals(token.trim())) {
        return Double.valueOf(token);
      }
     else {
        return null;
      }
    }
}
