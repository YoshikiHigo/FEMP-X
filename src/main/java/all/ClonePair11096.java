package all;

public class ClonePair11096 {

    boolean method1(String[] sarr,String str){
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

    boolean method2(String[] fileList,String f){
      if (fileList == null)   return false;
      if (f == null)   return false;
      for (int i=0; i < fileList.length; i++) {
        if (fileList[i].equals(f)) {
          return true;
        }
      }
      return false;
    }
}
