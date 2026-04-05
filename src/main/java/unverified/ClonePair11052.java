package unverified;

public class ClonePair11052 {

    boolean method1(String[] items,String newText){
      if (items == null || items.length == 0)   return false;
      for (  String s : items)   if (s.equalsIgnoreCase(newText))   return true;
      return false;
    }

    boolean method2(String[] list,String value){
      if (list == null || list.length == 0)   return false;
      boolean found=false;
      for (int i=0, len=list.length; i < len && !found; i++) {
        found=list[i].equals(value);
      }
      return found;
    }
}
