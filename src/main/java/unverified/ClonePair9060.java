package unverified;

public class ClonePair9060 {

    int method1(String strData,int defaultValue){
      int i=defaultValue;
      if (strData == null || strData.equals("")) {
        i=defaultValue;
      }
     else {
        try {
          i=Integer.parseInt(strData);
        }
     catch (    NumberFormatException e) {
          return defaultValue;
        }
      }
      return i;
    }

    int method2(String Str,int DefaultValue){
      try {
        if (Str == null)     return DefaultValue;
        if (String.valueOf(Str).trim().length() == 0)     return DefaultValue;
        String sValue=String.valueOf(Str).replaceAll(",","");
        sValue=sValue.trim();
        int dot=sValue.indexOf(".");
        if (dot > 0)     sValue=sValue.substring(0,dot);
        return Integer.parseInt(sValue);
      }
     catch (  Exception e) {
        return DefaultValue;
      }
    }
}
