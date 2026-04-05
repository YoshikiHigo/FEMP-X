package unverified;

public class ClonePair11075 {

    boolean method1(String[] values,String key){
      if (values == null || key == null) {
        return false;
      }
      boolean contain=false;
      for (int i=0; i < values.length; i++) {
        if (values[i].equals(key)) {
          contain=true;
          break;
        }
      }
      return contain;
    }

    boolean method2(String[] sarr,String str){
      boolean contains=false;
      if ((null != sarr) && (null != str)) {
        for (int i=0; (!contains) && (i < sarr.length); i++) {
          if (sarr[i].compareTo(str) == 0) {
            contains=true;
          }
        }
      }
      return contains;
    }
}
