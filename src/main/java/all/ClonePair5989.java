package all;

public class ClonePair5989 {

    float method1(String in){
      if (in == null || in.length() == 0)   return 0;
      try {
        return Float.parseFloat(in);
      }
     catch (  Exception e) {
        return 0;
      }
    }

    float method2(String s){
      if (s == null || s.isEmpty()) {
        return 0.0f;
      }
      try {
        return Float.parseFloat(s);
      }
     catch (  Throwable t) {
        return 0.0f;
      }
    }
}
