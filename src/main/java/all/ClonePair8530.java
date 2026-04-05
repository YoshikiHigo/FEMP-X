package all;

public class ClonePair8530 {

    Double method1(String value){
      if (value == null) {
        return null;
      }
      try {
        return new Double(value);
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }

    Double method2(String s){
      if (s != null && s.length() != 0) {
        try {
          return Double.valueOf(s.trim());
        }
     catch (    NumberFormatException e) {
        }
      }
      return null;
    }
}
