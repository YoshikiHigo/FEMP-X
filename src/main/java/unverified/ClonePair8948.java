package unverified;

public class ClonePair8948 {

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
