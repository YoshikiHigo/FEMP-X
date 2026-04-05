package all;

public class ClonePair5986 {

    float method1(String s){
      if (s == null || s.length() == 0) {
        return 0.0f;
      }
     else {
        return Float.parseFloat(s);
      }
    }

    float method2(String s){
      if (s == null || s.length() == 0)   return 0;
      return Float.parseFloat(s);
    }
}
