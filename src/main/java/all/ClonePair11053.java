package all;

public class ClonePair11053 {

    boolean method1(String[] items,String newText){
      if (items == null || items.length == 0)   return false;
      for (  String s : items)   if (s.equalsIgnoreCase(newText))   return true;
      return false;
    }

    boolean method2(String[] strs,String str){
      if ((str == null) || (strs == null))   return false;
      for (int s=0; s < strs.length; s++)   if (strs[s].equalsIgnoreCase(str))   return true;
      return false;
    }
}
