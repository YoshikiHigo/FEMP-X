package unverified;

public class ClonePair3406 {

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

    Float method2(String value){
      if (value == null)   return null;
      try {
        return Float.parseFloat(value);
      }
     catch (  Exception ex) {
        return null;
      }
    }
}
