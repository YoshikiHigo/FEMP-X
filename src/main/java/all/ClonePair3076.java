package all;

public class ClonePair3076 {

    double method1(String srcValue){
      if (srcValue == null || srcValue.toString().equals(""))   return 0;
      return Double.parseDouble(srcValue);
    }

    double method2(String s){
      if (s != null && s.trim().length() > 0) {
        return Double.parseDouble(s);
      }
      return 0.0;
    }
}
