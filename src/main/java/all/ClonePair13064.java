package all;

public class ClonePair13064 {

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

    String method2(String string,String original,String newString){
      if (string == null)   return null;
      int i=string.indexOf(original);
      if (i < 0)   return string;
      StringBuffer sb=new StringBuffer(string);
      while (i >= 0) {
        int f=i + original.length();
        sb.replace(i,f,newString);
        i=sb.toString().indexOf(original,i + newString.length());
      }
      return sb.toString();
    }
}
