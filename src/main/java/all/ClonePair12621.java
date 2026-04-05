package all;

public class ClonePair12621 {

    boolean method1(String name,String[] all){
      if (all == null || name == null)   return false;
      for (int i=0; i < all.length; i++)   if (name.startsWith(all[i]))   return true;
      return false;
    }

    boolean method2(String str,String[] strs){
      if (strs == null || str == null)   return false;
      for (int i=0; i < strs.length; i++) {
        if (strs[i].equals(str))     return true;
      }
      return false;
    }
}
