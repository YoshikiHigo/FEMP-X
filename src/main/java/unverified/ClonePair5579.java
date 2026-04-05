package unverified;

public class ClonePair5579 {

    boolean method1(String val,boolean dfault){
      try {
        if (val == null) {
          return dfault;
        }
        String s=val.trim().toLowerCase();
        if (s.length() == 0) {
          return dfault;
        }
        ;
        return (s.equals("true") || s.equals("yes") || s.equals("T")|| s.equals("Y"));
      }
     catch (  Exception e) {
        return dfault;
      }
    }

    boolean method2(String v,boolean defVal){
      if ((null == v) || (v.length() <= 0))   return defVal;
      return "yes".equalsIgnoreCase(v) || "true".equalsIgnoreCase(v);
    }
}
