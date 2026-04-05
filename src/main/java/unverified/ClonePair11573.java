package unverified;

public class ClonePair11573 {

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

    String method2(String source,String search,String replace){
      if (search.equals(replace)) {
        return source;
      }
      StringBuffer result=new StringBuffer();
      int len=search.length();
      if (len == 0) {
        return source;
      }
      int pos=0;
      int nPos;
      do {
        nPos=source.indexOf(search,pos);
        if (nPos != -1) {
          result.append(source.substring(pos,nPos));
          result.append(replace);
          pos=nPos + len;
        }
     else {
          result.append(source.substring(pos));
        }
      }
     while (nPos != -1);
      return result.toString();
    }
}
