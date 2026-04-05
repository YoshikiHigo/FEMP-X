package all;

public class ClonePair11670 {

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

    String method2(String text,String orig,String repl){
      int pos=0;
      while ((pos=text.indexOf(orig,pos)) >= 0) {
        text=text.substring(0,pos) + repl + text.substring(pos + orig.length(),text.length());
      }
      return text;
    }
}
