package unverified;

public class ClonePair12150 {

    String method1(String input,String replace,String replacement){
      if (replace.equals(replacement))   return input;
      int idx;
      if ((idx=input.indexOf(replace)) == -1) {
        return input;
      }
      boolean finished=false;
      while (!finished) {
        StringBuffer returning=new StringBuffer();
        while (idx != -1) {
          returning.append(input.substring(0,idx));
          returning.append(replacement);
          input=input.substring(idx + replace.length());
          idx=input.indexOf(replace);
        }
        returning.append(input);
        input=returning.toString();
        if ((idx=returning.indexOf(replace)) == -1) {
          finished=true;
        }
      }
      return input;
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
