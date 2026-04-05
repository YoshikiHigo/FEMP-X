package all;

public class ClonePair2511 {

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
      if (s == null)   return null;
      Short rval=null;
      try {
        rval=new Short(s);
      }
     catch (  NumberFormatException e) {
        return null;
      }
      return rval;
    }
}
