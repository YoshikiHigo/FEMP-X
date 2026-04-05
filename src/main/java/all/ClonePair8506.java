package all;

public class ClonePair8506 {

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

    Double method2(String param){
      if (param == null || param.length() == 0)   return null;
      try {
        return Double.parseDouble(param.replace(',','.'));
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }
}
