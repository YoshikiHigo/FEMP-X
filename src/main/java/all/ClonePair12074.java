package all;

public class ClonePair12074 {

    String method1(String text,String replace,String with){
      if (text == null)   return null;
      int li=0;
      int l=replace.length();
      int i=text.indexOf(replace,li);
      if (i < 0)   return text;
      StringBuffer aWorkString=new StringBuffer(text.length() + 1);
      while (i >= 0) {
        if (i > li)     aWorkString.append(text.substring(li,i));
        aWorkString.append(with);
        li=i + l;
        i=text.indexOf(replace,li);
      }
      aWorkString.append(text.substring(li));
      return aWorkString.toString();
    }

    String method2(String con,String tag,String rep){
      if (con != null) {
        int j=0;
        int i=0;
        String RETU="";
        String temp=con;
        int tagc=tag.length();
        while (i < con.length()) {
          if (con.substring(i).startsWith(tag)) {
            temp=con.substring(j,i) + rep;
            RETU+=temp;
            i+=tagc;
            j=i;
          }
     else {
            i+=1;
          }
        }
        RETU+=con.substring(j);
        return RETU;
      }
     else {
        return null;
      }
    }
}
