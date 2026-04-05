package all;

public class ClonePair5546 {

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

    boolean method2(String parameter,boolean defaultValue){
      if (parameter == null) {
        return defaultValue;
      }
     else   if (parameter.equalsIgnoreCase("true") || parameter.equalsIgnoreCase("t") || parameter.equalsIgnoreCase("1")) {
        return true;
      }
     else   if (parameter.equalsIgnoreCase("false") || parameter.equalsIgnoreCase("f") || parameter.equalsIgnoreCase("0")) {
        return false;
      }
     else {
        return defaultValue;
      }
    }
}
