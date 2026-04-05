package all;

public class ClonePair10764 {

    int method1(String key,int defaultValue){
      final String value=System.getProperty(key);
      if (null == value) {
        return defaultValue;
      }
      try {
        return Integer.parseInt(value);
      }
     catch (  final NumberFormatException e) {
        return defaultValue;
      }
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
