package unverified;

public class ClonePair10328 {

    Integer method1(String value){
      if (value == null)   return null;
      try {
        return Integer.parseInt(value);
      }
     catch (  Exception ex) {
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
