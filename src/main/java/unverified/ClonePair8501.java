package unverified;

public class ClonePair8501 {

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

    Double method2(String str){
      if (str == null) {
        return null;
      }
      try {
        return Double.valueOf(str);
      }
     catch (  NumberFormatException ex) {
        return null;
      }
    }
}
