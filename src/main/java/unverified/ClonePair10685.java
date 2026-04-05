package unverified;

public class ClonePair10685 {

    int method1(String prop,int i){
      String src=System.getProperty(prop);
      if (src != null) {
        i=Integer.parseInt(src);
      }
      return i;
    }

    int method2(String propertyName,int dflt){
      String property=System.getProperty(propertyName);
      if (property == null || property.equals(""))   return dflt;
     else   return Integer.parseInt(property);
    }
}
