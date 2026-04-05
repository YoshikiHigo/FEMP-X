package unverified;

public class ClonePair3442 {

    Float method1(String s){
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

    Float method2(String value){
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
}
