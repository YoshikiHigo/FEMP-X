package all;

public class ClonePair11048 {

    boolean method1(String[] interfaces,String intf){
      if (interfaces == null || interfaces.length <= 0) {
        return false;
      }
      for (int i=0; i < interfaces.length; i++) {
        if (interfaces[i].equals(intf)) {
          return true;
        }
      }
      return false;
    }

    boolean method2(String[] strs,String str){
      if ((str == null) || (strs == null))   return false;
      for (int s=0; s < strs.length; s++)   if (strs[s].equalsIgnoreCase(str))   return true;
      return false;
    }
}
