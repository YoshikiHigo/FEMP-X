package unverified;

import java.util.Vector;

public class ClonePair11692 {

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

    String method2(String sourceString,String match,String replace){
      if (match.length() == 0) {
        return sourceString;
      }
      final StringBuffer buffer=new StringBuffer(sourceString.length());
      int start=0;
      int end=sourceString.indexOf(match);
      final int matchLength=match.length();
      while (end != -1) {
        buffer.append(sourceString.substring(start,end));
        buffer.append(replace);
        start=end + matchLength;
        end=sourceString.indexOf(match,start);
      }
      buffer.append(sourceString.substring(start));
      return buffer.toString();
    }
}
