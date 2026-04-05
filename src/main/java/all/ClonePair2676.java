package all;

import java.util.Vector;

public class ClonePair2676 {

    String[] method1(String str,String delims){
      if (str == null)   return null;
     else   if (str.equals("") || delims == null || delims.length() == 0)   return new String[]{str};
      String[] s;
      Vector v=new Vector();
      int pos, newpos;
      pos=0;
      newpos=str.indexOf(delims,pos);
      while (newpos != -1) {
        v.addElement(str.substring(pos,newpos));
        pos=newpos + delims.length();
        newpos=str.indexOf(delims,pos);
      }
      v.addElement(str.substring(pos));
      s=new String[v.size()];
      for (int i=0; i < s.length; i++) {
        s[i]=(String)v.elementAt(i);
      }
      return s;
    }

    String[] method2(String str,String delims){
      if (str == null)   return null;
     else   if (str.equals("") || delims == null || delims.length() == 0)   return new String[]{str};
      String[] s;
      Vector v=new Vector();
      int pos=0;
      int newpos=str.indexOf(delims,pos);
      ;
      while (newpos != -1) {
        v.addElement(str.substring(pos,newpos));
        pos=newpos + delims.length();
        newpos=str.indexOf(delims,pos);
      }
      v.addElement(str.substring(pos));
      s=new String[v.size()];
      for (int i=0, cnt=s.length; i < cnt; i++)   s[i]=(String)v.elementAt(i);
      return s;
    }
}
