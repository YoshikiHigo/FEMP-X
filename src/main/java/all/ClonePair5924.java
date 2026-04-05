package all;

public class ClonePair5924 {

    boolean method1(String val,String start){
      if (val.length() > start.length()) {
        if (val.substring(0,start.length()).equals(start))     return true;
      }
      return false;
    }

    boolean method2(String matchin,String matchon){
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
}
