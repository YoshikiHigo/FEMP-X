package unverified;

public class ClonePair11647 {

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

    String method2(String value,String src,String dest){
      StringBuffer result=new StringBuffer();
      int pos=0;
      int index=value.indexOf(src);
      while (index >= 0) {
        if (index > pos)     result.append(value.substring(pos,index - 1));
        result.append(dest);
        pos=pos + src.length();
        index=value.indexOf(src,index + dest.length());
      }
      result.append(value.substring(pos));
      return result.toString();
    }
}
