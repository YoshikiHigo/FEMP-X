package all;

public class ClonePair9105 {

    int method1(String key,int defaultVal){
      String property=System.getProperty(key);
      if (property == null) {
        return defaultVal;
      }
      return Integer.parseInt(property);
    }

    int method2(String propertyName,int dflt){
      String property=System.getProperty(propertyName);
      if (property == null || property.equals(""))   return dflt;
     else   return Integer.parseInt(property);
    }
}
