package unverified;

public class ClonePair3459 {

    Float method1(String value){
      if (value == null) {
        return null;
      }
      try {
        return Float.valueOf(value);
      }
     catch (  NumberFormatException ex) {
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
