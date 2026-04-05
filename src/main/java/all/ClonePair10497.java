package all;

public class ClonePair10497 {

    Integer method1(String response){
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

    Integer method2(String value){
      if (value == null)   return null;
      try {
        return Integer.parseInt(value);
      }
     catch (  NumberFormatException nfe) {
        return null;
      }
    }
}
