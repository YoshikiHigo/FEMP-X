package all;

public class ClonePair13066 {

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

    String method2(String s1,String s2,String s3){
      if (s1 == null)   return null;
      int inc=s3.length() - s2.length();
      int offset=0;
      int fromIndex=0;
      int findIndex=s1.indexOf(s2,fromIndex);
      StringBuffer buf=new StringBuffer(s1);
      while (findIndex != -1) {
        buf.delete(findIndex + offset,findIndex + offset + s2.length());
        buf.insert(findIndex + offset,s3);
        offset+=inc;
        fromIndex=findIndex + s2.length();
        findIndex=s1.indexOf(s2,fromIndex);
      }
      String result=buf.toString();
      return result;
    }
}
