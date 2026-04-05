package unverified;

public class ClonePair10282 {

    String method1(String str,String s1,String s2){
      if (str.equals(s1))   return s2;
     else   if (!str.endsWith(s1))   return str;
      int pos=str.lastIndexOf(s1);
      if (pos < 0)   return str;
      return str.substring(0,str.length() - s1.length()) + s2;
    }

    String method2(String source,String from,String to){
      StringBuffer sb=new StringBuffer();
      int oldIndex=0, newIndex;
      while (-1 != (newIndex=source.indexOf(from,oldIndex))) {
        sb.append(source.substring(oldIndex,newIndex)).append(to);
        oldIndex=newIndex + from.length();
      }
      if (oldIndex < source.length())   sb.append(source.substring(oldIndex));
      return sb.toString();
    }
}
