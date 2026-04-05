package unverified;

public class ClonePair8729 {

    int method1(String value,int defaultValue){
      int parsed=defaultValue;
      if (value != null) {
        try {
          parsed=Integer.parseInt(value);
        }
     catch (    NumberFormatException e) {
          parsed=defaultValue;
        }
      }
      return parsed;
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
