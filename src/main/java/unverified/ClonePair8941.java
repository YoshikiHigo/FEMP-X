package unverified;

public class ClonePair8941 {

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
