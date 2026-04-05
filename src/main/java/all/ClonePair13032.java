package all;

public class ClonePair13032 {

    String method1(String s,String find,String replace){
      if (s == null)   return s;
      StringBuffer result=new StringBuffer();
      int index;
      while ((index=s.indexOf(find)) >= 0) {
        result.append(s.substring(0,index));
        result.append(replace);
        s=s.substring(index + find.length());
      }
      result.append(s);
      return result.toString();
    }

    String method2(String str,String oldStr,String newStr){
      if (str == null || str.length() == 0) {
        return str;
      }
      StringBuffer buffer=new StringBuffer();
      int pos=0;
      int oldPos=0;
      while ((pos=str.indexOf(oldStr,oldPos)) != -1) {
        buffer.append(str.substring(oldPos,pos));
        buffer.append(newStr);
        oldPos=pos + oldStr.length();
      }
      buffer.append(str.substring(oldPos,str.length()));
      return buffer.toString();
    }
}
