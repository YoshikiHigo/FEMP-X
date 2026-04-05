package all;

public class ClonePair5661 {

    boolean method1(String str,boolean trimWhitespaces){
      if (str == null)   return true;
      if (trimWhitespaces)   return str.trim().length() == 0;
     else   return str.length() == 0;
    }

    boolean method2(String str,boolean consider_trim){
      if (str == null)   return true;
     else   if (str.length() == 0)   return true;
     else   if (consider_trim && str.trim().length() == 0)   return true;
     else   return false;
    }
}
