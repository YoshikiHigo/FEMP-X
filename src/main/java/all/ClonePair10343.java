package all;

public class ClonePair10343 {

    String method1(String str,String s1,String s2){
      if (str.equals(s1))   return s2;
     else   if (!str.endsWith(s1))   return str;
      int pos=str.lastIndexOf(s1);
      if (pos < 0)   return str;
      return str.substring(0,str.length() - s1.length()) + s2;
    }

    String method2(String str,String old_sub,String new_sub){
      if (str.indexOf(old_sub) != -1 && !old_sub.equals(new_sub)) {
        StringBuffer buf=new StringBuffer();
        int len=old_sub.length();
        int index, fromIndex=0;
        while ((index=str.indexOf(old_sub,fromIndex)) != -1) {
          buf.append(str.substring(fromIndex,index));
          buf.append(new_sub);
          fromIndex=index + len;
        }
        buf.append(str.substring(fromIndex));
        return buf.toString();
      }
      return str;
    }
}
