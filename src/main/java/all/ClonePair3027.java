package all;

import java.util.Vector;

public class ClonePair3027 {

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

    String[] method2(String text,String run){
      if (text.length() == 0)   return new String[0];
      int n=1;
      int i=text.indexOf(run);
      String[] lines;
      int runLen=run.length();
      if (i < 0 || runLen == 0) {
        lines=new String[1];
        lines[0]=text;
        return lines;
      }
      int len=text.length() - runLen;
      for (; i >= 0 && i < len; n++)   i=text.indexOf(run,i + runLen);
      lines=new String[n];
      i=0;
      int ipt=0;
      int pt=0;
      for (; (ipt=text.indexOf(run,i)) >= 0 && pt + 1 < n; ) {
        lines[pt++]=text.substring(i,ipt);
        i=ipt + runLen;
      }
      if (text.indexOf(run,len) != len)   len+=runLen;
      lines[pt]=text.substring(i,len);
      return lines;
    }
}
