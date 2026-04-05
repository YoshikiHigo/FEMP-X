package unverified;

public class ClonePair3454 {

    Float method1(String value){
      if (value == null)   return null;
      try {
        return Float.parseFloat(value);
      }
     catch (  NumberFormatException nfe) {
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
