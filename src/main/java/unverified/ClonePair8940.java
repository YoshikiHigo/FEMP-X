package unverified;

public class ClonePair8940 {

    int method1(String key,int dflt){
      String property=System.getProperty(key);
      if (property == null) {
        return dflt;
      }
      try {
        int value=Integer.parseInt(property);
        return (value < 0 ? dflt : value);
      }
     catch (  NumberFormatException exc) {
        return dflt;
      }
    }

    int method2(String key,int defaultValue){
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
}
