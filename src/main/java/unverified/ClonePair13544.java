package unverified;

public class ClonePair13544 {

    String method1(String or,String ac,String ne){
      int orl=or.length();
      int acl=ac.length();
      StringBuilder resB=new StringBuilder();
      if (acl <= orl && or.lastIndexOf(ac) == orl - acl)   return resB.append(or.substring(0,or.length() - ac.length())).append(ne).toString();
      return or;
    }

    String method2(String str,String substr,String with){
      String outi=new String("");
      int width=str.length();
      int count=0;
      do {
        if (str.toLowerCase().indexOf(substr.toLowerCase(),count) != -1) {
          outi=outi + str.substring(count,str.toLowerCase().indexOf(substr.toLowerCase(),count)) + with;
          count=str.toLowerCase().indexOf(substr.toLowerCase(),count) + substr.length();
        }
     else {
          outi=outi + str.substring(count,str.length());
          count=str.length();
        }
      }
     while (count < width);
      return outi;
    }
}
