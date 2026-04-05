package all;

public class ClonePair12431 {

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

    String method2(String subject,String find,String replace){
      if (subject == null)   return null;
      StringBuffer buf=new StringBuffer();
      int l=find.length();
      int s=0;
      int i=subject.indexOf(find);
      while (i != -1) {
        buf.append(subject.substring(s,i));
        buf.append(replace);
        s=i + l;
        i=subject.indexOf(find,s);
      }
      buf.append(subject.substring(s));
      return buf.toString();
    }
}
