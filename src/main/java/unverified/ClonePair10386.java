package unverified;

public class ClonePair10386 {

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
        return Integer.valueOf(value);
      }
     catch (  NumberFormatException ex) {
        return null;
      }
    }
}
