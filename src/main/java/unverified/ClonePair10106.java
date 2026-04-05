package unverified;

public class ClonePair10106 {

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

    Integer method2(String response){
      if (response == null) {
        return null;
      }
      try {
        Integer parsed=Integer.parseInt(response);
        return parsed;
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }
}
