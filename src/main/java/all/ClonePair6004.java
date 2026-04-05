package all;

public class ClonePair6004 {

    boolean method1(String newName,String inputPrice){
      if (newName.isEmpty() && inputPrice.isEmpty())   return false;
      boolean flag=false;
      char[] pValue=inputPrice.toCharArray();
      for (int i=0; i < pValue.length; i++) {
        if (!flag && pValue[i] == '.')     flag=true;
     else     if (!(Character.isDigit(pValue[i])))     return false;
      }
      return true;
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
