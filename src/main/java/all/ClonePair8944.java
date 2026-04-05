package all;

public class ClonePair8944 {

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

    int method2(String propertyName,int dflt){
      String property=System.getProperty(propertyName);
      if (property == null || property.equals(""))   return dflt;
     else   return Integer.parseInt(property);
    }
}
