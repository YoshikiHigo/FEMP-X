package all;

public class ClonePair12501 {

    String method1(String string,String oldPattern,String newPattern){
      if (string == null)   return string;
      int oldIndex=string.indexOf(oldPattern);
      if (oldIndex < 0)   return string;
      StringBuffer returnVal=new StringBuffer();
      int start=0;
      do {
        returnVal.append(string.substring(start,oldIndex));
        returnVal.append(newPattern);
        start=oldIndex + oldPattern.length();
        oldIndex=string.indexOf(oldPattern,start);
      }
     while (oldIndex > 0);
      returnVal.append(string.substring(start));
      return returnVal.toString();
    }

    String method2(String str,String search,String replace){
      int start=0;
      int end=(str != null) ? str.indexOf(search) : -1;
      if (end == -1)   return str;
      StringBuffer buf=new StringBuffer(str.length());
      while (end != -1) {
        buf.append(str.substring(start,end));
        buf.append(replace);
        start=end + search.length();
        end=str.indexOf(search,start);
      }
      if (start != str.length()) {
        buf.append(str.substring(start));
      }
      return buf.toString();
    }
}
