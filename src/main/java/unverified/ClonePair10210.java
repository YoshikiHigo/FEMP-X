package unverified;

public class ClonePair10210 {

    Integer method1(String value){
      if (value != null) {
        try {
          return Integer.parseInt(value);
        }
     catch (    NumberFormatException e) {
        }
      }
      return null;
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
