package all;

public class ClonePair3062 {

    double method1(String str){
      if (str == null || str.equals("")) {
        return 0;
      }
      return (new Double(str).doubleValue());
    }

    double method2(String srcValue){
      if (srcValue == null || srcValue.toString().equals(""))   return 0;
      return Double.parseDouble(srcValue);
    }
}
