package unverified;

public class ClonePair8549 {

    Double method1(String s){
      if (s != null && s.length() != 0) {
        try {
          return Double.valueOf(s.trim());
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
