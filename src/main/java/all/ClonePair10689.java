package all;

public class ClonePair10689 {

    int method1(String prop,int i){
      String src=System.getProperty(prop);
      if (src != null) {
        i=Integer.parseInt(src);
      }
      return i;
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
