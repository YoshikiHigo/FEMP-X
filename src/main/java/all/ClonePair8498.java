package all;

public class ClonePair8498 {

    Double method1(String string){
      if (string == null)   return null;
      try {
        return new Double(string.trim());
      }
     catch (  Exception e) {
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
