package all;

public class ClonePair3452 {

    Float method1(String value){
      if (value == null)   return null;
      try {
        return Float.parseFloat(value);
      }
     catch (  NumberFormatException nfe) {
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
