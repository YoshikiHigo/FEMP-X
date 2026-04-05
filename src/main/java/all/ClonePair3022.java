package all;

import java.util.Vector;

public class ClonePair3022 {

    String[] method1(String strSource,String strDelim){
      Vector vResult=new Vector();
      int iDelimWidth=strDelim.length();
      String strPiece;
      int iPrev=0;
      int iNext=strSource.indexOf(strDelim);
      while (iNext != -1) {
        strPiece=strSource.substring(iPrev,iNext);
        vResult.addElement(strPiece);
        iPrev=iNext + iDelimWidth;
        iNext=strSource.indexOf(strDelim,iPrev);
      }
      strPiece=strSource.substring(iPrev);
      if (strPiece.length() > 0) {
        vResult.addElement(strPiece);
      }
      String arstrResult[]=new String[vResult.size()];
      vResult.copyInto(arstrResult);
      return arstrResult;
    }

    String[] method2(String str,String delim){
      if (str.length() < 1)   return new String[0];
      Vector strs=new Vector();
      int dlen=delim.length();
      int previdx=0;
      do {
        int didx=str.indexOf(delim,previdx);
        if (didx >= 0) {
          strs.add(str.substring(previdx,didx));
        }
     else     if (previdx < str.length()) {
          strs.add(str.substring(previdx));
        }
        previdx=didx + dlen;
      }
     while (previdx >= dlen);
      String[] strarr=new String[strs.size()];
      for (int i=0; i < strarr.length; i++) {
        strarr[i]=(String)strs.elementAt(i);
      }
      return strarr;
    }
}
