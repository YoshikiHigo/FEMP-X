package all;

public class ClonePair10841 {

    int method1(String name,int defaultValue){
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
