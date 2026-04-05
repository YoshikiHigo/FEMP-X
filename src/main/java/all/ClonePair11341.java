package all;

public class ClonePair11341 {

    int method1(String sSource,String sSought){
      if ((sSource == null) || (sSought == null))   return -1;
      final int iSrcLen=sSource.length();
      final int iSghLen=sSought.length();
      if (iSrcLen < iSghLen)   return -1;
      if (iSrcLen == iSghLen)   return (sSource.equalsIgnoreCase(sSought) ? 0 : -1);
      final int iReducedLen=iSrcLen - iSghLen;
      for (int p=0; p < iReducedLen; p++) {
        if (sSource.substring(p,p + iSghLen).equalsIgnoreCase(sSought))     return p;
      }
      return -1;
    }

    int method2(String str,String s){
      if (str == null || s == null)   return -1;
      if (str.length() < s.length())   return -1;
      int pos=str.indexOf(s);
      if (pos > -1)   return pos;
      return str.toLowerCase().indexOf(s.toLowerCase());
    }
}
