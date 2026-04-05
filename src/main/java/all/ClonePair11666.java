package all;

public class ClonePair11666 {

    String method1(String in,String what,String with){
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
