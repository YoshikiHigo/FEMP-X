package unverified;

public class ClonePair11054 {

    boolean method1(String[] items,String newText){
      if (items == null || items.length == 0)   return false;
      for (  String s : items)   if (s.equalsIgnoreCase(newText))   return true;
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
