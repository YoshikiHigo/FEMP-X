package unverified;

public class ClonePair10421 {

    String method1(String original,String oldString,String newString){
      int index=original.indexOf(oldString);
      if (index < 0) {
        return original;
      }
     else {
        final String replace=newString == null ? "" : newString;
        final StringBuilder buf=new StringBuilder(Math.max(16,original.length() + replace.length()));
        int last=0;
        while (index != -1) {
          buf.append(original.substring(last,index));
          buf.append(replace);
          last=index + oldString.length();
          index=original.indexOf(oldString,last);
        }
        buf.append(original.substring(last));
        return buf.toString();
      }
    }

    String method2(String str,String pattern,String replace){
      int s=0;
      int e=0;
      if (str == null)   str="";
      StringBuffer result=new StringBuffer();
      while ((e=str.indexOf(pattern,s)) >= 0) {
        result.append(str.substring(s,e));
        if (replace != null)     result.append(replace);
        s=e + pattern.length();
      }
      result.append(str.substring(s));
      return result.substring(0);
    }
}
