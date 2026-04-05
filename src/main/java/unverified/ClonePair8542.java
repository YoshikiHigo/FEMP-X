package unverified;

public class ClonePair8542 {

    Double method1(String value){
      if (value != null) {
        try {
          return Double.parseDouble(value);
        }
     catch (    NumberFormatException e) {
        }
      }
      return null;
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
