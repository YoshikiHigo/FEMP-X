package all;

public class ClonePair5985 {

    float method1(String s){
      if (s == null || s.length() == 0) {
        return 0.0f;
      }
     else {
        return Float.parseFloat(s);
      }
    }

    float method2(String value){
      if (value != null && !value.equals("")) {
        return Float.parseFloat(value);
      }
      return 0;
    }
}
