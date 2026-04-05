package all;

public class ClonePair5991 {

    float method1(String s){
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

    float method2(String param){
      if (param == null || param.trim().equals("")) {
        return 0f;
      }
      try {
        return Float.parseFloat(param);
      }
     catch (  NumberFormatException e) {
        e.printStackTrace();
        return 0f;
      }
    }
}
