package unverified;

public class ClonePair11567 {

    String method1(String source,String target,String replacement){
      if (source == null) {
        return source;
      }
      String retvalue=source;
      int index=0;
      int previousIndex=0;
      if (source.indexOf(target) > -1) {
        StringBuffer hold=new StringBuffer();
        while (true) {
          index=source.indexOf(target,previousIndex);
          if (index < 0) {
            hold.append(source.substring(previousIndex));
            break;
          }
          hold.append(source.substring(previousIndex,index));
          hold.append(replacement);
          previousIndex=index + target.length();
        }
        retvalue=hold.toString();
      }
      return retvalue;
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
