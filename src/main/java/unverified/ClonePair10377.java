package unverified;

public class ClonePair10377 {

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

    Integer method2(String integerNumber){
      if (integerNumber == null)   return null;
      try {
        return new Integer(integerNumber);
      }
     catch (  NumberFormatException nfx) {
        return null;
      }
    }
}
