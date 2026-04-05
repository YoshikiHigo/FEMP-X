package unverified;

public class ClonePair11150 {

    String method1(String str,String from,String to){
      if (str == null)   return str;
      int index=str.indexOf(from);
      if (index == -1)   return str;
      int pos=0;
      final int fromLen=from.length();
      final StringBuilder sb=new StringBuilder();
      while (index > -1) {
        sb.append(str.substring(pos,index)).append(to);
        pos=index + fromLen;
        index=str.indexOf(from,pos);
      }
      sb.append(str.substring(pos));
      return sb.toString();
    }

    String method2(String orig,String src,String dest){
      if (orig == null)   return null;
      StringBuffer res=new StringBuffer();
      int start, end=0, last=0;
      while ((start=orig.indexOf(src,end)) != -1) {
        res.append(orig.substring(last,start));
        res.append(dest);
        end=start + src.length();
        last=start + src.length();
      }
      res.append(orig.substring(end));
      return res.toString();
    }
}
