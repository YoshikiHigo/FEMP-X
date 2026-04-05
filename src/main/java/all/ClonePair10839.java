package all;

public class ClonePair10839 {

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
