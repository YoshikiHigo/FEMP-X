package all;

import java.util.Vector;

public class ClonePair11691 {

    String method1(String source,String match,String replace){
      if (match.equals("")) {
        return source;
      }
      int index=-1;
      int matchLength=match.length();
      int offset=matchLength - replace.length();
      StringBuffer result=new StringBuffer(source);
      Vector indexes=new Vector();
      while ((index=source.indexOf(match,index)) != -1) {
        indexes.addElement(new Integer(index));
        index+=matchLength;
      }
      for (int i=0; i < indexes.size(); i++) {
        int indexStart=((Integer)indexes.elementAt(i)).intValue() - offset * i;
        int indexEnd=indexStart + matchLength;
        result.replace(indexStart,indexEnd,replace);
      }
      return result.toString();
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
