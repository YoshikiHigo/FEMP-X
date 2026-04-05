package all;

public class ClonePair8325 {

    boolean method1(String matchin,String matchon){
      int lenmatchin=matchin.length();
      int lenmatchon=matchon.length();
      int pos=0;
      if (lenmatchon > lenmatchin) {
        return false;
      }
      while (pos + lenmatchon < lenmatchin) {
        String sub=matchin.substring(pos,pos + lenmatchon);
        if (sub.equals(matchon)) {
          return true;
        }
        pos++;
      }
      return false;
    }

    boolean method2(String msg,String inter){
      int i=msg.indexOf(inter);
      if (i == -1)   return false;
      if (msg.lastIndexOf("com.limegroup.gnutella",i) != -1 && msg.lastIndexOf("org.limewire",i) != -1)   return false;
      i+=inter.length();
      if (i >= msg.length())   return false;
      if (msg.indexOf("com.limegroup.gnutella",i) != -1 && msg.lastIndexOf("org.limewire",i) != -1)   return false;
      return true;
    }
}
