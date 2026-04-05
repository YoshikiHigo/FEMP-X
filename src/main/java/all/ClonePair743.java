package all;

public class ClonePair743 {

    long method1(String key,long defaultValue){
      final String value=System.getProperty(key);
      if (null == value) {
        return defaultValue;
      }
      try {
        return Long.parseLong(value);
      }
     catch (  final NumberFormatException e) {
        return defaultValue;
      }
    }

    long method2(String name,long defaultValue){
      String val=System.getProperty(name);
      if (val != null) {
        try {
          return Long.parseLong(val);
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
