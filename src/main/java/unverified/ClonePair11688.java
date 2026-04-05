package unverified;

import java.util.Vector;

public class ClonePair11688 {

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

    String method2(String in,String oldPat,String newPat){
      if (oldPat.length() == 0)   return in;
      if (oldPat.length() == 1 && newPat.length() == 1)   return in.replace(oldPat.charAt(0),newPat.charAt(0));
      int lastIndex=0;
      int newIndex=0;
      StringBuffer newString=new StringBuffer();
      for (; ; ) {
        newIndex=in.indexOf(oldPat,lastIndex);
        if (newIndex != -1) {
          newString.append(in.substring(lastIndex,newIndex) + newPat);
          lastIndex=newIndex + oldPat.length();
        }
     else {
          newString.append(in.substring(lastIndex));
          break;
        }
      }
      return newString.toString();
    }
}
