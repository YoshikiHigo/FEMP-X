package all;

public class ClonePair2702 {

    double method1(String s){
      if (s == null || s.length() == 0)   return (double)0;
     else   return Double.valueOf(s).doubleValue();
    }

    double method2(String srcValue){
      if (srcValue == null || srcValue.toString().equals(""))   return 0;
      return Double.parseDouble(srcValue);
    }
}
