package unverified;

public class ClonePair3128 {

    double method1(String s){
      if (s != null && s.trim().length() > 0) {
        return Double.parseDouble(s);
      }
      return 0.0;
    }

    double method2(String s){
      if (s == null || s.length() == 0) {
        return 0.0;
      }
     else {
        return Double.parseDouble(s);
      }
    }
}
