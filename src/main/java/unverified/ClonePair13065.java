package unverified;

public class ClonePair13065 {

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

    String method2(String string,String oldValue,String newValue){
      if (string == null) {
        return null;
      }
      int oldPos=string.indexOf(oldValue);
      if (oldPos < 0) {
        return string;
      }
      final StringBuffer retVal=new StringBuffer(string.length() + Math.max((newValue.length() - oldValue.length()) * 5,0));
      int lastPos=0;
      while (oldPos > -1) {
        retVal.append(string.substring(lastPos,oldPos));
        retVal.append(newValue);
        lastPos=oldPos + oldValue.length();
        oldPos=string.indexOf(oldValue,lastPos);
      }
      if (lastPos < string.length()) {
        retVal.append(string.substring(lastPos));
      }
      return retVal.toString();
    }
}
