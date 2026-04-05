package unverified;

public class ClonePair3420 {

    Float method1(String value){
      if (value != null) {
        try {
          return Float.parseFloat(value);
        }
     catch (    NumberFormatException e) {
        }
      }
      return null;
    }

    Float method2(String value){
      if (value == null)   return null;
      try {
        return Float.parseFloat(value);
      }
     catch (  NumberFormatException nfe) {
        return null;
      }
    }
}
