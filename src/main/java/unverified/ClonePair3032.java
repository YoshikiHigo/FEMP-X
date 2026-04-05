package unverified;

import java.util.Vector;

public class ClonePair3032 {

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
      Vector<String> vec=new Vector<String>();
      int offset=str.indexOf(delim), prevIndex=-1;
      String cur=null;
      while (offset != -1 && offset < str.length()) {
        if (offset > 0) {
          cur=str.substring(prevIndex + 1,offset);
          vec.add(cur);
          prevIndex=offset;
          offset=str.indexOf(delim,prevIndex + 1);
        }
      }
      if (offset < str.length() - 1) {
        vec.add(str.substring(prevIndex + 1));
      }
      return vec.toArray(new String[0]);
    }
}
