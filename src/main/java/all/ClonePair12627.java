package all;

public class ClonePair12627 {

    boolean method1(String str,String[] strs){
      if (strs == null || str == null)   return false;
      for (int i=0; i < strs.length; i++) {
        if (strs[i].equals(str))     return true;
      }
      return false;
    }

    boolean method2(String s,String[] sa){
      if (sa != null && s != null) {
        for (int i=0; i < sa.length; i++) {
          String string=sa[i];
          if (s.trim().compareTo(string.trim()) == 0)       return true;
        }
      }
      return false;
    }
}
