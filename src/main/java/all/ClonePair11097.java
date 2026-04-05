package all;

public class ClonePair11097 {

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

    boolean method2(String[] array,String string){
      for (int i=0; array != null && string != null && i < array.length; i++) {
        if (array[i].equals(string)) {
          return true;
        }
      }
      return false;
    }
}
