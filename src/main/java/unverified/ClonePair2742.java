package unverified;

public class ClonePair2742 {

    double method1(String s){
      if (s == null || s.isEmpty()) {
        return 0.0d;
      }
      try {
        return Double.parseDouble(s);
      }
     catch (  Throwable t) {
        return 0.0d;
      }
    }

    double method2(String value){
      if (value == null || value.length() == 0)   return 0;
      double d=0;
      try {
        d=Double.parseDouble(value);
      }
     catch (  Exception e) {
        d=0;
      }
      return d;
    }
}
