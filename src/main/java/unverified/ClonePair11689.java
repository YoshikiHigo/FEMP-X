package unverified;

import java.util.Vector;

public class ClonePair11689 {

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

    String method2(String where,String what,String replacement){
      if (what.length() == 0) {
        return where;
      }
      StringBuffer sb=null;
      int pos=0, ppos=-1;
      while ((pos=where.indexOf(what,pos)) > -1) {
        if (sb == null) {
          sb=new StringBuffer(where.length() + (replacement.length() - what.length()));
        }
        final int start=(ppos > -1 ? ppos + what.length() : 0);
        sb.append(where.substring(start,pos));
        sb.append(replacement);
        ppos=pos;
        pos+=what.length();
      }
      if (ppos > -1 && ppos < (where.length() - what.length())) {
        sb.append(where.substring(ppos + what.length()));
      }
      return (sb != null ? sb.toString() : where);
    }
}
