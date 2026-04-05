package unverified;

public class ClonePair8626 {

    boolean method1(String s,String test){
      if (s.length() < test.length())   return false;
      for (int i=0; i < test.length(); i++) {
        if (Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(test.charAt(i)))     return false;
      }
      return true;
    }

    boolean method2(String url1,String url2){
      if ((url1.length() > 1) && url1.endsWith("/"))   url1=url1.substring(0,url1.length() - 1);
      if ((url2.length() > 1) && url2.endsWith("/"))   url2=url2.substring(0,url2.length() - 1);
      if (url1.equalsIgnoreCase(url2))   return true;
      return false;
    }
}
