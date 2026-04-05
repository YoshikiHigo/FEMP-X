package all;

public class ClonePair10268 {

    String method1(String str,String s1,String s2){
      if (str.equals(s1))   return s2;
     else   if (!str.endsWith(s1))   return str;
      int pos=str.lastIndexOf(s1);
      if (pos < 0)   return str;
      return str.substring(0,str.length() - s1.length()) + s2;
    }

    String method2(String in,String what,String with){
      int pos=0, lp=0;
      StringBuffer sb=new StringBuffer();
      while ((pos=in.indexOf(what,lp)) > -1) {
        sb.append(in.substring(lp,pos));
        sb.append(with);
        lp=pos + what.length();
      }
      if (lp < in.length()) {
        sb.append(in.substring(lp));
      }
      return sb.toString();
    }
}
