package all;

public class ClonePair9107 {

    int method1(String key,int defaultVal){
      String property=System.getProperty(key);
      if (property == null) {
        return defaultVal;
      }
      return Integer.parseInt(property);
    }

    int method2(String name,int def){
      String propValue=System.getProperty(name);
      if (propValue != null) {
        try {
          return Integer.parseInt(propValue);
        }
     catch (    Exception e) {
          return def;
        }
      }
     else {
        return def;
      }
    }
}
