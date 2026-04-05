package unverified;

public class ClonePair8503 {

    Double method1(String value){
      if ((value != null) && (value.length() > 0)) {
        try {
          return new Double(value);
        }
     catch (    NumberFormatException e) {
        }
      }
      return null;
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
