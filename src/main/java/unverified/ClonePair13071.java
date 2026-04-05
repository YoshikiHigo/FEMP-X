package unverified;

public class ClonePair13071 {

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

    String method2(String s,String s1,String s2){
      if (s == null)   return s;
      int i=-1;
      for (int j=s.indexOf(s1); j != -1 && i != 0; i--) {
        s=s.substring(0,j) + s2 + s.substring(j + s1.length());
        j=s.indexOf(s1,j + s2.length());
      }
      return s;
    }
}
