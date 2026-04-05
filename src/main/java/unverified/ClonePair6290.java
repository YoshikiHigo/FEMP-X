package unverified;

public class ClonePair6290 {

    boolean method1(String item,String part){
      int i0=part.indexOf('*');
      int i1=part.lastIndexOf('*');
      if ((i0 == -1) && (i1 == -1))   return item.equals(part);
     else   if (i0 == i1)   return item.startsWith(part.substring(0,i0)) && item.endsWith(part.substring(i0 + 1));
     else   if ((i0 == 0) && (i1 == (part.length() - 1)))   return item.contains(part.substring(i0 + 1,i1));
     else   return item.startsWith(part.substring(0,i0)) && item.endsWith(part.substring(i0 + 1)) && item.contains(part.substring(i0 + 1,i1));
    }

    boolean method2(String s1,String s2){
      if (s1.length() == s2.length()) {
        final char c1[]=s1.toCharArray();
        final char c2[]=s2.toCharArray();
        int n=s1.length();
        while (--n >= 0) {
          if (c1[n] != c2[n]) {
            return false;
          }
        }
      }
     else {
        return false;
      }
      return true;
    }
}
