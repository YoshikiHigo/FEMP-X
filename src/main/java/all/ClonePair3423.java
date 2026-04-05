package all;

public class ClonePair3423 {

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
