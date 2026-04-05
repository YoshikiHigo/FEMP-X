package all;

public class ClonePair3419 {

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
