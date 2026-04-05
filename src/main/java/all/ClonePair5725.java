package all;

public class ClonePair5725 {

    boolean method1(String str,boolean isTrim){
      if (isTrim) {
        return null == str || "".equals(str.trim());
      }
     else {
        return null == str || "".equals(str);
      }
    }

    boolean method2(String str,boolean consider_trim){
      if (str == null)   return true;
     else   if (str.length() == 0)   return true;
     else   if (consider_trim && str.trim().length() == 0)   return true;
     else   return false;
    }
}
