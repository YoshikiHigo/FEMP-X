package unverified;

public class ClonePair3409 {

    Float method1(String value){
      if (value == null) {
        return null;
      }
      try {
        return new Float(value);
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }

    Float method2(String s){
      if (s == null)   return null;
      try {
        return Float.parseFloat(s);
      }
     catch (  Exception e) {
        System.err.println("Error decoding Float-String '" + s + "'");
      }
      return null;
    }
}
