package all;

public class ClonePair10380 {

    Integer method1(String s){
      if (s == null)   return null;
      try {
        return Integer.parseInt(s);
      }
     catch (  Exception e) {
        System.err.println("Error decoding Integer-String '" + s + "'");
      }
      return null;
    }

    Integer method2(String value){
      if (value == null) {
        return null;
      }
      try {
        return new Integer(value);
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }
}
