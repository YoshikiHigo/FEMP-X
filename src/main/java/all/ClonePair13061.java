package all;

public class ClonePair13061 {

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

    String method2(String aSearch,String aFind,String aReplace){
      String result=aSearch;
      if (result != null && result.length() > 0) {
        int a=0;
        int b=0;
        while (true) {
          a=result.indexOf(aFind,b);
          if (a != -1) {
            result=result.substring(0,a) + aReplace + result.substring(a + aFind.length());
            b=a + aReplace.length();
          }
     else       break;
        }
      }
      return result;
    }
}
