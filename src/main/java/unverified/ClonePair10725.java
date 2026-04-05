package unverified;

public class ClonePair10725 {

    int method1(String Str,int DefaultValue){
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

    int method2(String v,int dflt){
      if (v != null) {
        try {
          dflt=Integer.decode(v).intValue();
        }
     catch (    Exception exc) {
        }
      }
      return dflt;
    }
}
