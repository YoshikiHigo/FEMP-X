package all;

public class ClonePair10762 {

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

    int method2(String propertyName,int dflt){
      String property=System.getProperty(propertyName);
      if (property == null || property.equals(""))   return dflt;
     else   return Integer.parseInt(property);
    }
}
