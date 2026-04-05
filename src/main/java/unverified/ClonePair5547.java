package unverified;

public class ClonePair5547 {

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

    boolean method2(String attributeValue,boolean def){
      if (attributeValue == null)   return def;
      if ("0".equals(attributeValue) || "false".equals(attributeValue))   return false;
      if ("1".equals(attributeValue) || "true".equals(attributeValue))   return true;
      System.out.println("*** Error while parsing boolean attribute value '" + def + "'");
      return def;
    }
}
