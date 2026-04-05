package all;

public class ClonePair9200 {

    boolean method1(String url1,String url2){
      if ((url1.length() > 1) && url1.endsWith("/"))   url1=url1.substring(0,url1.length() - 1);
      if ((url2.length() > 1) && url2.endsWith("/"))   url2=url2.substring(0,url2.length() - 1);
      if (url1.equalsIgnoreCase(url2))   return true;
      return false;
    }

    boolean method2(String s1,String s2){
      if (s1.length() < s2.length())   return false;
      for (int i=0; i < s2.length(); i++) {
        char c1=s1.charAt(i), c2=s2.charAt(i);
        if (c1 != c2 && Character.toLowerCase(c2) != c1 && Character.toUpperCase(c2) != c1)     return false;
      }
      return true;
    }
}
