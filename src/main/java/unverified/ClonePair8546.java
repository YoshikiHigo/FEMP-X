package unverified;

public class ClonePair8546 {

    Double method1(String str){
      if (str == null || "".equals(str.trim())) {
        return null;
      }
      Double doubleObject=null;
      try {
        doubleObject=Double.valueOf(str);
      }
     catch (  Exception e) {
      }
      return doubleObject;
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
