package unverified;

public class ClonePair12420 {

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

    String method2(String src,String oldstr,String newstr){
      if (src == null) {
        return null;
      }
      StringBuffer dest=new StringBuffer("");
      int len=oldstr.length();
      int srclen=src.length();
      int pos;
      int oldpos;
      for (oldpos=0; (pos=src.indexOf(oldstr,oldpos)) >= 0; oldpos=pos + len) {
        dest.append(src.substring(oldpos,pos));
        dest.append(newstr);
      }
      if (oldpos < srclen) {
        dest.append(src.substring(oldpos,srclen));
      }
      return dest.toString();
    }
}
