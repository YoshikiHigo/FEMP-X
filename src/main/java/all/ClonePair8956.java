package all;

public class ClonePair8956 {

    boolean method1(String string1,String string2){
      boolean stringsAreEqual=false;
      if (string1.length() == string2.length()) {
        int stringLength=string1.length();
        int pos;
        for (pos=0; pos < stringLength; ++pos) {
          if (Character.toUpperCase(string1.charAt(pos)) != Character.toUpperCase(string2.charAt(pos))) {
            break;
          }
        }
        if (pos == stringLength) {
          stringsAreEqual=true;
        }
      }
      return stringsAreEqual;
    }

    boolean method2(String url1,String url2){
      if ((url1.length() > 1) && url1.endsWith("/"))   url1=url1.substring(0,url1.length() - 1);
      if ((url2.length() > 1) && url2.endsWith("/"))   url2=url2.substring(0,url2.length() - 1);
      if (url1.equalsIgnoreCase(url2))   return true;
      return false;
    }
}
