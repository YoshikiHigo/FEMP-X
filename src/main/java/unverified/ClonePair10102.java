package unverified;

public class ClonePair10102 {

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

    Integer method2(String s){
      if (s == null)   return null;
      try {
        return Integer.parseInt(s);
      }
     catch (  Exception e) {
        System.err.println("Error decoding Integer-String '" + s + "'");
      }
      return null;
    }
}
