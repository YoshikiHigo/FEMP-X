package unverified;

public class ClonePair11030 {

    boolean method1(String[] strs,String str){
      if ((str == null) || (strs == null))   return false;
      for (int s=0; s < strs.length; s++)   if (strs[s].equals(str))   return true;
      return false;
    }

    boolean method2(String[] strs,String str){
      if ((str == null) || (strs == null))   return false;
      for (int s=0; s < strs.length; s++)   if (strs[s].equalsIgnoreCase(str))   return true;
      return false;
    }
}
