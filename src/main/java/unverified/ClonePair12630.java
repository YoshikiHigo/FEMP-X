package unverified;

public class ClonePair12630 {

    boolean method1(String str,String[] strs){
      if (strs == null || str == null)   return false;
      for (int i=0; i < strs.length; i++) {
        if (strs[i].equals(str))     return true;
      }
      return false;
    }

    boolean method2(String searchFor,String[] searchIn){
      if ((searchIn == null) || (searchFor == null))   return false;
      for (int i=0; i < searchIn.length; i++) {
        if (searchIn[i].equals(searchFor))     return true;
      }
      return false;
    }
}
