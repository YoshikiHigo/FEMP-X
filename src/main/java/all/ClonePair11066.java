package all;

public class ClonePair11066 {

    boolean method1(String[] strs,String str){
      if ((str == null) || (strs == null))   return false;
      for (int s=0; s < strs.length; s++)   if (strs[s].equalsIgnoreCase(str))   return true;
      return false;
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
