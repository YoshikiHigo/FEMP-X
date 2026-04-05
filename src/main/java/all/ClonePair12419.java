package all;

public class ClonePair12419 {

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

    String method2(String original,String replace,String with){
      if (original == null) {
        return original;
      }
      final int len=replace.length();
      StringBuffer sb=new StringBuffer(original.length());
      int start=0;
      int found=-1;
      while ((found=original.indexOf(replace,start)) != -1) {
        sb.append(original.substring(start,found));
        sb.append(with);
        start=found + len;
      }
      sb.append(original.substring(start));
      return sb.toString();
    }
}
