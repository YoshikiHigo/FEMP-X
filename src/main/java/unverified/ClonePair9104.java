package unverified;

public class ClonePair9104 {

    int method1(String key,int defaultVal){
      String property=System.getProperty(key);
      if (property == null) {
        return defaultVal;
      }
      return Integer.parseInt(property);
    }

    int method2(String name,int defaultValue){
      String val=System.getProperty(name);
      if (val != null) {
        try {
          return Integer.parseInt(val);
        }
     catch (    NumberFormatException e) {
          return defaultValue;
        }
      }
     else {
        return defaultValue;
      }
    }
}
