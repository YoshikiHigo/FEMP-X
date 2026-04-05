package all;

public class ClonePair8475 {

    Double method1(String s){
      try {
        if (s != null) {
          return Double.parseDouble(s);
        }
     else {
          return null;
        }
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
