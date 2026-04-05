package all;

public class ClonePair2711 {

    double method1(String s){
      if (s == null || s.length() == 0)   return (double)0;
     else   return Double.valueOf(s).doubleValue();
    }

    double method2(String s){
      if (s != null && s.trim().length() > 0) {
        return Double.parseDouble(s);
      }
      return 0.0;
    }
}
