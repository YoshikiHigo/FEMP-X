package unverified;

public class ClonePair11643 {

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

    String method2(String src,String replace,String with){
      String result;
      int pos;
      result="";
      while (!src.equals("")) {
        pos=src.indexOf(replace);
        if (pos == -1) {
          result+=src;
          src="";
        }
     else {
          result+=src.substring(0,pos) + with;
          src=src.substring(pos + replace.length(),src.length());
        }
      }
      return result;
    }
}
