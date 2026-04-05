package unverified;

public class ClonePair6286 {

    boolean method1(String item,String part){
      int i0=part.indexOf('*');
      int i1=part.lastIndexOf('*');
      if ((i0 == -1) && (i1 == -1))   return item.equals(part);
     else   if (i0 == i1)   return item.startsWith(part.substring(0,i0)) && item.endsWith(part.substring(i0 + 1));
     else   if ((i0 == 0) && (i1 == (part.length() - 1)))   return item.contains(part.substring(i0 + 1,i1));
     else   return item.startsWith(part.substring(0,i0)) && item.endsWith(part.substring(i0 + 1)) && item.contains(part.substring(i0 + 1,i1));
    }

    boolean method2(String url1,String url2){
      if ((url1.length() > 1) && url1.endsWith("/"))   url1=url1.substring(0,url1.length() - 1);
      if ((url2.length() > 1) && url2.endsWith("/"))   url2=url2.substring(0,url2.length() - 1);
      if (url1.equalsIgnoreCase(url2))   return true;
      return false;
    }
}
