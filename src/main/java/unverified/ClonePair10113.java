package unverified;

public class ClonePair10113 {

    Integer method1(String source){
      if (source == null) {
        return null;
      }
      try {
        return Integer.parseInt(source);
      }
     catch (  Exception e) {
        return null;
      }
    }

    Integer method2(String data){
      if (data == null || data.length() == 0)   return null;
      try {
        return Integer.valueOf(data);
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }
}
