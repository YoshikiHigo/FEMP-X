package all;

public class ClonePair5763 {

    boolean method1(String attributeValue,boolean def){
      if (attributeValue == null)   return def;
      if ("0".equals(attributeValue) || "false".equals(attributeValue))   return false;
      if ("1".equals(attributeValue) || "true".equals(attributeValue))   return true;
      System.out.println("*** Error while parsing boolean attribute value '" + def + "'");
      return def;
    }

    boolean method2(String str,boolean defaultValue){
      if (str != null && str.length() > 0) {
        if (str.equalsIgnoreCase("true") || str.equals("1")) {
          return true;
        }
     else {
          return false;
        }
      }
     else {
        return defaultValue;
      }
    }
}
