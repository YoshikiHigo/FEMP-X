package unverified;

public class ClonePair5987 {

    float method1(String value){
      if (value != null && !value.equals("")) {
        return Float.parseFloat(value);
      }
      return 0;
    }

    float method2(String s){
      if (s == null || s.length() == 0)   return 0;
      return Float.parseFloat(s);
    }
}
