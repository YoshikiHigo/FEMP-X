package unverified;

public class ClonePair11063 {

    boolean method1(String[] strs,String str){
      if ((str == null) || (strs == null))   return false;
      for (int s=0; s < strs.length; s++)   if (strs[s].equalsIgnoreCase(str))   return true;
      return false;
    }

    boolean method2(String[] values,String key){
      if (values == null || key == null) {
        return false;
      }
      boolean contain=false;
      for (int i=0; i < values.length; i++) {
        if (values[i].equals(key)) {
          contain=true;
          break;
        }
      }
      return contain;
    }
}
