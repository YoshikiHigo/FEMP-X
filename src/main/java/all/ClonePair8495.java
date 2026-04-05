package all;

public class ClonePair8495 {

    Double method1(String string){
      if (string == null)   return null;
      try {
        return new Double(string.trim());
      }
     catch (  Exception e) {
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
