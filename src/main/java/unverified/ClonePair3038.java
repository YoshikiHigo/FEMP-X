package unverified;

public class ClonePair3038 {

    String[] method1(String str,String split){
      int iCurIndex=0;
      int iOccurrences=0;
      while ((iCurIndex=str.indexOf(split,iCurIndex) + split.length()) >= split.length())   iOccurrences++;
      String[] result=new String[iOccurrences + 1];
      if (result.length == 1) {
        result[0]=str;
        return result;
      }
      iCurIndex=0;
      for (int i=0; i < iOccurrences; i++) {
        if (i == 0) {
          int iNextIndex=str.indexOf(split);
          if (iNextIndex == -1)       break;
          result[i]=str.substring(iCurIndex,iNextIndex);
          iCurIndex=iNextIndex + split.length() - 1;
        }
     else {
          int iNextIndex=str.indexOf(split,iCurIndex + split.length());
          if (iNextIndex == -1)       break;
          result[i]=str.substring(iCurIndex + split.length(),iNextIndex);
          iCurIndex=iNextIndex + split.length() - 1;
        }
      }
      if (iCurIndex + split.length() >= str.length()) {
        result[result.length - 1]="";
      }
     else {
        result[result.length - 1]=str.substring(iCurIndex + split.length(),str.length());
      }
      return result;
    }

    String[] method2(String source,String div){
      int arynum=0, intIdx=0, intIdex=0, div_length=div.length();
      if (source.compareTo("") != 0) {
        if (source.indexOf(div) != -1) {
          intIdx=source.indexOf(div);
          for (int intCount=1; ; intCount++) {
            if (source.indexOf(div,intIdx + div_length) != -1) {
              intIdx=source.indexOf(div,intIdx + div_length);
              arynum=intCount;
            }
     else {
              arynum+=2;
              break;
            }
          }
        }
     else {
          arynum=1;
        }
      }
     else {
        arynum=0;
      }
      intIdx=0;
      intIdex=0;
      String[] returnStr=new String[arynum];
      if (source.compareTo("") != 0) {
        if (source.indexOf(div) != -1) {
          intIdx=(int)source.indexOf(div);
          returnStr[0]=(String)source.substring(0,intIdx);
          for (int intCount=1; ; intCount++) {
            if (source.indexOf(div,intIdx + div_length) != -1) {
              intIdex=(int)source.indexOf(div,intIdx + div_length);
              returnStr[intCount]=(String)source.substring(intIdx + div_length,intIdex);
              intIdx=(int)source.indexOf(div,intIdx + div_length);
            }
     else {
              returnStr[intCount]=(String)source.substring(intIdx + div_length,source.length());
              break;
            }
          }
        }
     else {
          returnStr[0]=(String)source.substring(0,source.length());
          return returnStr;
        }
      }
     else {
        return returnStr;
      }
      return returnStr;
    }
}
