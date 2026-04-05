package unverified;

public class ClonePair8473 {

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

    Double method2(String value){
      if (value != null) {
        try {
          return Double.parseDouble(value);
        }
     catch (    NumberFormatException e) {
        }
      }
      return null;
    }
}
