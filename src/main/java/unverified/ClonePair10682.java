package unverified;

public class ClonePair10682 {

    int method1(String prop,int i){
      String src=System.getProperty(prop);
      if (src != null) {
        i=Integer.parseInt(src);
      }
      return i;
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
