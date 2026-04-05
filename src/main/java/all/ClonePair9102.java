package all;

public class ClonePair9102 {

    int method1(String key,int defaultVal){
      String property=System.getProperty(key);
      if (property == null) {
        return defaultVal;
      }
      return Integer.parseInt(property);
    }

    int method2(String prop,int i){
      String src=System.getProperty(prop);
      if (src != null) {
        i=Integer.parseInt(src);
      }
      return i;
    }
}
