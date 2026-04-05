package all;

public class ClonePair5662 {

    boolean method1(String str,String uurl,boolean praefix){
      boolean ret=false;
      String url=uurl.toLowerCase();
      String s1="";
      if (str.equals("")) {
        ret=true;
      }
     else {
        for (int i=0; i < str.length(); ++i) {
          if (str.charAt(i) != ',') {
            s1+=str.charAt(i);
          }
          if (str.charAt(i) == ',' || i >= str.length() - 1) {
            if (praefix) {
              if (url.startsWith(s1.toLowerCase())) {
                ret=true;
                break;
              }
            }
     else {
              if (url.endsWith(s1.toLowerCase())) {
                ret=true;
                break;
              }
            }
            s1="";
          }
        }
      }
      return ret;
    }

    boolean method2(String filter,String object,boolean caseSensitive){
      if (caseSensitive)   return (object.indexOf(filter) != -1);
      return (object.toUpperCase().indexOf(filter.toUpperCase()) != -1);
    }
}
