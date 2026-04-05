package unverified;

public class ClonePair13050 {

    String method1(String s,String find,String replace){
      if (s == null)   return s;
      StringBuffer result=new StringBuffer();
      int index;
      while ((index=s.indexOf(find)) >= 0) {
        result.append(s.substring(0,index));
        result.append(replace);
        s=s.substring(index + find.length());
      }
      result.append(s);
      return result.toString();
    }

    String method2(String p_Value,String p_SearchString,String p_ReplaceString){
      if (p_Value == null)   return null;
      StringBuffer buf=new StringBuffer(p_Value.length());
      int len=p_SearchString.length();
      int off=0;
      int index=0;
      while ((index=p_Value.indexOf(p_SearchString,off)) >= 0) {
        buf.append(p_Value.substring(off,index));
        buf.append(p_ReplaceString);
        off=index + len;
      }
      buf.append(p_Value.substring(off));
      return buf.toString();
    }
}
