package unverified;

public class ClonePair3405 {

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
      try {
        if (s != null) {
          return Float.parseFloat(s);
        }
     else {
          return null;
        }
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }
}
