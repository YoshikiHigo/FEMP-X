package all;

public class ClonePair3064 {

    double method1(String str){
      if (str == null || str.equals("")) {
        return 0;
      }
      return (new Double(str).doubleValue());
    }

    double method2(String s){
      if (s != null && s.trim().length() > 0) {
        return Double.parseDouble(s);
      }
      return 0.0;
    }
}
