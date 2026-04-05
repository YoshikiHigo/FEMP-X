package all;

public class ClonePair2512 {

    Short method1(String str){
      if (str == null || "".equals(str.trim())) {
        return null;
      }
      if (str.endsWith(".0")) {
        str=str.substring(0,str.indexOf(".0"));
      }
      Short shortObject=null;
      try {
        shortObject=Short.valueOf(str);
      }
     catch (  Exception e) {
      }
      return shortObject;
    }

    Short method2(String value){
      if (value == null) {
        return null;
      }
      try {
        return new Short(value);
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }
}
