package all;

public class ClonePair7862 {

    boolean method1(String[] list){
      if (list == null || list.length == 0) {
        return true;
      }
      String str=null;
      int len=list.length;
      for (int i=0; i < len; i++) {
        str=list[i];
        if (str == null || "".equals(str)) {
          return true;
        }
      }
      return false;
    }

    boolean method2(String[] sa){
      if (sa == null || sa.length == 0)   return true;
      for (int i=0; i < sa.length; i++) {
        if (sa[i] == null || sa[i].equals("*"))     return true;
      }
      return false;
    }
}
