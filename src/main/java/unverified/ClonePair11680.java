package unverified;

public class ClonePair11680 {

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

    String method2(String source,String target,String replacement){
      StringBuffer result=new StringBuffer();
      int index=source.indexOf(target);
      int lastIndex=0;
      if (index >= 0) {
        result.append(source.substring(lastIndex,index));
        result.append(replacement);
        lastIndex=index + target.length();
      }
      if (lastIndex < source.length()) {
        result.append(source.substring(lastIndex));
      }
      return result.toString();
    }
}
