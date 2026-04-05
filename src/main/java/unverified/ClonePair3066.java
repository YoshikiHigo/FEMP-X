package unverified;

public class ClonePair3066 {

    double method1(String str){
      if (str == null || str.equals("")) {
        return 0;
      }
      return (new Double(str).doubleValue());
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
