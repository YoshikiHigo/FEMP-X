package unverified;

public class ClonePair13070 {

    String method1(String str,String find,String replace){
      int strlen, findlen;
      char[] chars, replaceChars;
      if (str == null || ((strlen=(chars=str.toCharArray()).length) < (findlen=find.length()))) {
        return str;
      }
      replaceChars=replace.toCharArray();
      final StringBuilder sb=new StringBuilder(strlen);
      int sCut=0;
      for (int eCut; (eCut=str.indexOf(find,sCut)) != -1; sCut=eCut + findlen) {
        sb.append(chars,sCut,(eCut - sCut)).append(replaceChars);
      }
      return sCut > 0 ? sb.append(chars,sCut,(strlen - sCut)).toString() : str;
    }

    String method2(String str,String strFrom,String strTo){
      if (str == null || str.indexOf(strFrom) < 0 || strFrom.equals(strTo))   return str;
      int fromLength=strFrom.length();
      if (fromLength == 0)   return str;
      boolean isOnce=(strTo.indexOf(strFrom) >= 0);
      int ipt;
      while (str.indexOf(strFrom) >= 0) {
        StringBuffer s=new StringBuffer();
        int ipt0=0;
        while ((ipt=str.indexOf(strFrom,ipt0)) >= 0) {
          s.append(str.substring(ipt0,ipt)).append(strTo);
          ipt0=ipt + fromLength;
        }
        s.append(str.substring(ipt0));
        str=s.toString();
        if (isOnce)     break;
      }
      return str;
    }
}
