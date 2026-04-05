package all;

public class ClonePair2518 {

    Short method1(String value){
      if (value == null) {
        return null;
      }
      try {
        return new Short(value);
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }

    Short method2(String s){
      try {
        if (s != null) {
          return Short.decode(s);
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
