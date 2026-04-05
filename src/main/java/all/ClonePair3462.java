package all;

import java.util.Vector;

public class ClonePair3462 {

    Vector method1(String s,char separator,int limit,boolean omitEmpty){
      Vector sv=new Vector();
      String s2="";
      int pos=0, lastPos=0, count=0;
      if (s.length() == 0 || separator == '\0' || limit == 0) {
        return null;
      }
      s+=separator;
      while ((pos=s.indexOf(separator,pos)) != -1) {
        if (count == limit) {
          if (lastPos < s.length()) {
            s2=s.substring(lastPos,s.length() - 1);
            sv.addElement(s2);
          }
          break;
        }
        s2=s.substring(lastPos,pos);
        pos++;
        lastPos=pos;
        count++;
        if (omitEmpty && s2.length() == 0) {
          continue;
        }
        sv.addElement(s2);
      }
      if (!sv.isEmpty()) {
        return sv;
      }
      return null;
    }

    Vector method2(String s,char separator,int limit,boolean omitEmpty){
      Vector sv=new Vector();
      String[] sa;
      String s2="";
      int pos=0, lastPos=0, count=0;
      if (s.length() == 0 || separator == '\0' || limit == 0) {
        return null;
      }
      s+=separator;
      while ((pos=s.indexOf(separator,pos)) != -1) {
        if (count == limit) {
          if (lastPos < s.length()) {
            s2=s.substring(lastPos,s.length() - 1);
            sv.addElement(s2);
          }
          break;
        }
        s2=s.substring(lastPos,pos);
        pos++;
        lastPos=pos;
        count++;
        if (omitEmpty && s2.length() == 0) {
          continue;
        }
        sv.addElement(s2);
      }
      if (!sv.isEmpty()) {
        return sv;
      }
      return null;
    }
}
