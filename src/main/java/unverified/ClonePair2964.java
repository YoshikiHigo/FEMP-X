package unverified;

public class ClonePair2964 {

    double method1(String e){
      if (e == null || e.length() == 0)   return 0.0;
      if (e.charAt(0) == 'e' || e.charAt(0) == 'E')   return Double.parseDouble("1" + e);
     else   return Double.parseDouble(e);
    }

    double method2(String srcValue){
      if (srcValue == null || srcValue.toString().equals(""))   return 0;
      return Double.parseDouble(srcValue);
    }
}
