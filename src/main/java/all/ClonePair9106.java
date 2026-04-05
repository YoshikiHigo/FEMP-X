package all;

public class ClonePair9106 {

    int method1(String key,int defaultVal){
      String property=System.getProperty(key);
      if (property == null) {
        return defaultVal;
      }
      return Integer.parseInt(property);
    }

    int method2(String p,int defaultVal){
      String propString=System.getProperty(p);
      int returnVal=defaultVal;
      if (propString != null) {
        try {
          returnVal=Integer.parseInt(propString);
        }
     catch (    NumberFormatException e) {
        }
      }
      return returnVal;
    }
}
