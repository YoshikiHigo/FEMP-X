package all;

public class ClonePair12426 {

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

    String method2(String value,String oldKeySubstring,String newKeySubstring){
      if (value == null) {
        return null;
      }
      int oldKeySubstringSize=oldKeySubstring.length();
      while (true) {
        int index=value.indexOf(oldKeySubstring);
        if (index == -1) {
          break;
        }
        value=value.substring(0,index) + newKeySubstring + value.substring(index + oldKeySubstringSize);
      }
      return value;
    }
}
