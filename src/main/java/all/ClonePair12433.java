package all;

public class ClonePair12433 {

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

    String method2(String source,String whatBefore,String whatAfter){
      if (null == source || source.length() == 0) {
        return source;
      }
      int beforeLen=whatBefore.length();
      if (beforeLen == 0) {
        return source;
      }
      StringBuffer result=new StringBuffer("");
      int lastIndex=0;
      int index=source.indexOf(whatBefore,lastIndex);
      while (index >= 0) {
        result.append(source.substring(lastIndex,index));
        result.append(whatAfter);
        lastIndex=index + beforeLen;
        index=source.indexOf(whatBefore,lastIndex);
      }
      result.append(source.substring(lastIndex));
      return result.toString();
    }
}
