package all;

public class ClonePair5544 {

    boolean method1(String toParse,boolean errorReturnValue){
      if (toParse == null)   return errorReturnValue;
      try {
        if (toParse.compareTo("1") == 0)     return true;
     else     if (toParse.compareTo("0") == 0)     return false;
     else     if (toParse.toLowerCase().compareTo("true") == 0)     return true;
     else     if (toParse.toLowerCase().compareTo("false") == 0)     return false;
      }
     catch (  Exception e) {
      }
      return errorReturnValue;
    }

    boolean method2(String b,boolean defval){
      if (b == null)   return defval;
      String upperB=b.toUpperCase();
      if ("1".equals(b))   return (true);
      if ("0".equals(b))   return (false);
      if ("TRUE".equals(upperB))   return (true);
      if ("FALSE".equals(upperB))   return (false);
      return defval;
    }
}
