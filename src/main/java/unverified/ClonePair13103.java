package unverified;

public class ClonePair13103 {

    String method1(String source,String from,String to){
      StringBuffer sb=new StringBuffer();
      int oldIndex=0, newIndex;
      while (-1 != (newIndex=source.indexOf(from,oldIndex))) {
        sb.append(source.substring(oldIndex,newIndex)).append(to);
        oldIndex=newIndex + from.length();
      }
      if (oldIndex < source.length())   sb.append(source.substring(oldIndex));
      return sb.toString();
    }

    String method2(String str,String regex,String replacement){
      int found=0;
      int start=0;
      int len=regex.length();
      if (str == "")   return "";
      while ((found=str.indexOf(regex,found)) != -1) {
        if (found + len >= str.length()) {
          return str.substring(0,found) + replacement;
        }
     else {
          str=str.substring(0,found) + replacement + str.substring(found + len);
        }
        found+=len;
      }
      return str;
    }
}
