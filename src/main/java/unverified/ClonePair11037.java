package unverified;

public class ClonePair11037 {

    boolean method1(String[] strs,String str){
      if ((str == null) || (strs == null))   return false;
      for (int s=0; s < strs.length; s++)   if (strs[s].equals(str))   return true;
      return false;
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
