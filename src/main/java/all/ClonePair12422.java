package all;

public class ClonePair12422 {

    String method1(String p_Value,String p_SearchString,String p_ReplaceString){
      if (p_Value == null)   return null;
      StringBuffer buf=new StringBuffer(p_Value.length());
      int len=p_SearchString.length();
      int off=0;
      int index=0;
      if ((index=p_Value.indexOf(p_SearchString,off)) >= 0) {
        buf.append(p_Value.substring(off,index));
        buf.append(p_ReplaceString);
        off=index + len;
      }
      buf.append(p_Value.substring(off));
      return buf.toString();
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
