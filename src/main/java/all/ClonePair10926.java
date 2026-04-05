package all;

public class ClonePair10926 {

    int method1(String p,int defaultVal){
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
