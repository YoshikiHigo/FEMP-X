package unverified;

public class ClonePair2701 {

    double method1(String s){
      if (s == null || s.length() == 0)   return (double)0;
     else   return Double.valueOf(s).doubleValue();
    }

    double method2(String str){
      if (str == null || str.equals("")) {
        return 0;
      }
      return (new Double(str).doubleValue());
    }
}
