package all;

public class ClonePair10548 {

    Integer method1(String value){
      if (value == null) {
        return null;
      }
      try {
        return Integer.valueOf(value);
      }
     catch (  NumberFormatException ex) {
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
