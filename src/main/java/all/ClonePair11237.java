package all;

public class ClonePair11237 {

    String method1(String source,String needle,String replace){
      if (null == source || null == needle || replace == null) {
        return source;
      }
      int needleLenth=needle.length();
      StringBuffer sb=new StringBuffer();
      int pos=source.indexOf(needle);
      while (-1 != pos) {
        sb.append(source.substring(0,pos)).append(replace);
        source=source.substring(pos + needleLenth);
        pos=source.indexOf(needle);
      }
      sb.append(source);
      return sb.toString();
    }

    String method2(String in,String old,String neww){
      int b=0;
      if (in == null || old == null || neww == null || (b=in.indexOf(old)) == -1 || old.length() == 0) {
        return in;
      }
      int oldLength=old.length();
      StringBuffer mod=new StringBuffer(in.length());
      mod.append(in.substring(0,b));
      int e=in.indexOf(old,b + oldLength);
      while (e != -1) {
        mod.append(neww);
        mod.append(in.substring(b + oldLength,e));
        b=e;
        e=in.indexOf(old,b + oldLength);
      }
      mod.append(neww);
      if (b < in.length()) {
        mod.append(in.substring(b + oldLength));
      }
      return mod.toString();
    }
}
