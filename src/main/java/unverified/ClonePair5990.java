package unverified;

public class ClonePair5990 {

    float method1(String in){
      if (in == null || in.length() == 0)   return 0;
      try {
        return Float.parseFloat(in);
      }
     catch (  Exception e) {
        return 0;
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
