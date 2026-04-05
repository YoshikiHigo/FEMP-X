package all;

public class ClonePair2618 {

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
        result[result.length - 1]=str.substring(iCurIndex + split.length(),str.length() - 1);
      }
      return result;
    }

    String[] method2(String str,String split){
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
}
