package unverified;

public class ClonePair3078 {

    double method1(String srcValue){
      if (srcValue == null || srcValue.toString().equals(""))   return 0;
      return Double.parseDouble(srcValue);
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
