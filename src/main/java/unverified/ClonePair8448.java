package unverified;

public class ClonePair8448 {

    Double method1(String valueString){
      if (valueString == null || valueString.equals(""))   return null;
      try {
        return Double.parseDouble(valueString);
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
