package unverified;

public class ClonePair10384 {

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

    Integer method2(String string){
      if (string == null)   return null;
      try {
        return new Integer(string.trim());
      }
     catch (  Exception e) {
        return null;
      }
    }
}
