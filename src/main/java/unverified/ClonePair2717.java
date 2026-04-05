package unverified;

public class ClonePair2717 {

    double method1(String s){
      if (s == null || s.length() == 0)   return (double)0;
     else   return Double.valueOf(s).doubleValue();
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
