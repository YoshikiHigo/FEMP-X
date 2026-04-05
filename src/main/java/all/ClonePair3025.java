package all;

import java.util.ArrayList;
import java.util.Vector;

public class ClonePair3025 {

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

    String[] method2(String string,String separator){
      int separatorLength=separator.length();
      if (string.indexOf(separator) == -1) {
        if (string.length() == 0) {
          String[] array={};
          return array;
        }
     else {
          String[] array={string};
          return array;
        }
      }
      ArrayList<String> v=new ArrayList<String>();
      int index1=0;
      int index2=0;
      while (true) {
        index2=string.indexOf(separator,index1 + separatorLength);
        if (index2 == -1)     break;
        v.add(string.substring(index1,index2));
        index1=index2 + separatorLength;
      }
      v.add(string.substring(index1));
      String[] array=new String[v.size()];
      for (int i=0; i < v.size(); i++) {
        array[i]=(String)v.get(i);
      }
      return array;
    }
}
