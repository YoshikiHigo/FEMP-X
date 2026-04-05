package unverified;

public class ClonePair10563 {

    String method1(String s,String o,String n){
      if (s == null)   return null;
      int begin=s.indexOf(o);
      if (begin == -1)   return s;
      int end=begin + o.length();
      return (new StringBuffer(s)).replace(begin,end,n).toString();
    }

    String method2(String str,String find,String replace){
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
}
