package all;

public class ClonePair2513 {

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

    Short method2(String s){
      try {
        if (s != null) {
          return Short.decode(s);
        }
     else {
          return null;
        }
      }
     catch (  NumberFormatException e) {
        return null;
      }
    }
}
