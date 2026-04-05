package all;

public class ClonePair6198 {

    boolean method1(String a,String b){
      if (a == b) {
        return true;
      }
      int n=a.length();
      if (n == b.length()) {
        while (--n >= 0) {
          if (a.charAt(n) != b.charAt(n))       return false;
        }
        return true;
      }
      return false;
    }

    boolean method2(String item,String part){
      int i0=part.indexOf('*');
      int i1=part.lastIndexOf('*');
      if ((i0 == -1) && (i1 == -1))   return item.equals(part);
     else   if (i0 == i1)   return item.startsWith(part.substring(0,i0)) && item.endsWith(part.substring(i0 + 1));
     else   if ((i0 == 0) && (i1 == (part.length() - 1)))   return item.contains(part.substring(i0 + 1,i1));
     else   return item.startsWith(part.substring(0,i0)) && item.endsWith(part.substring(i0 + 1)) && item.contains(part.substring(i0 + 1,i1));
    }
}
