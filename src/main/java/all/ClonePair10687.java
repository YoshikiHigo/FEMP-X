package all;

public class ClonePair10687 {

    int method1(String prop,int i){
      String src=System.getProperty(prop);
      if (src != null) {
        i=Integer.parseInt(src);
      }
      return i;
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
