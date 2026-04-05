package all;

public class ClonePair2745 {

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
      try {
        if (value == null || value.length() == 0) {
          return 0;
        }
     else {
          return Double.parseDouble(value);
        }
      }
     catch (  Exception e) {
        return 0;
      }
    }
}
