package unverified;

public class ClonePair6279 {

    boolean method1(String item,String part){
      int i0=part.indexOf('*');
      int i1=part.lastIndexOf('*');
      if ((i0 == -1) && (i1 == -1))   return item.equals(part);
     else   if (i0 == i1)   return item.startsWith(part.substring(0,i0)) && item.endsWith(part.substring(i0 + 1));
     else   if ((i0 == 0) && (i1 == (part.length() - 1)))   return item.contains(part.substring(i0 + 1,i1));
     else   return item.startsWith(part.substring(0,i0)) && item.endsWith(part.substring(i0 + 1)) && item.contains(part.substring(i0 + 1,i1));
    }

    boolean method2(String s1,String s2){
      if (s1.length() != s2.length()) {
        System.out.println("Compare failed: lengths differ");
        return false;
      }
      for (int i=0; i < s1.length(); i++) {
        if (s1.charAt(i) != s2.charAt(i)) {
          System.out.println("Compare failed: bytes at " + i + " differ ["+ s1.charAt(i)+ "] ["+ s2.charAt(i)+ "]");
          return false;
        }
      }
      return true;
    }
}
