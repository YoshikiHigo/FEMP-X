package all;

public class ClonePair3448 {

    Float method1(String value){
      if (value == null)   return null;
      try {
        return Float.parseFloat(value);
      }
     catch (  Exception ex) {
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
