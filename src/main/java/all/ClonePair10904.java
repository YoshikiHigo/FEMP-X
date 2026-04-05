package all;

public class ClonePair10904 {

    int method1(String propertyName,int dflt){
      String property=System.getProperty(propertyName);
      if (property == null || property.equals(""))   return dflt;
     else   return Integer.parseInt(property);
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
