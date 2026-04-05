package all;

public class ClonePair11064 {

    boolean method1(String[] strs,String str){
      if ((str == null) || (strs == null))   return false;
      for (int s=0; s < strs.length; s++)   if (strs[s].equalsIgnoreCase(str))   return true;
      return false;
    }

    boolean method2(String[] args,String argument){
      if (args != null && args.length > 0) {
        for (int i=0; i < args.length; i++) {
          if (args[i].equalsIgnoreCase(argument)) {
            return true;
          }
        }
      }
      return false;
    }
}
