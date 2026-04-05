package all;

public class ClonePair8477 {

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
