package unverified;

public class ClonePair10761 {

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
