package all;

public class ClonePair10358 {

    String method1(String str,String s1,String s2){
      if (str.equals(s1))   return s2;
     else   if (!str.endsWith(s1))   return str;
      int pos=str.lastIndexOf(s1);
      if (pos < 0)   return str;
      return str.substring(0,str.length() - s1.length()) + s2;
    }

    String method2(String s,String sub,String with){
      StringBuffer sb=new StringBuffer(s.length() * 2);
      int c=0;
      int i=0;
      while ((i=s.indexOf(sub,c)) != -1) {
        sb.append(s.substring(c,i));
        sb.append(with);
        c=i + sub.length();
      }
      if (c < s.length())   sb.append(s.substring(c,s.length()));
      return sb.toString();
    }
}
