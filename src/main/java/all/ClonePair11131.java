package all;

public class ClonePair11131 {

    String[] method1(String v,char ch,boolean trim){
      int splits=0;
      for (int i=0, n=v.length(); i < n; i++) {
        if (v.charAt(i) == ch)     splits++;
      }
      String[] ret=new String[splits + 1];
      if (splits == 0) {
        if (trim)     v=v.trim();
        ret[0]=v;
        return ret;
      }
      int start=0;
      int cnt=0;
      for (int i=0, n=v.length(); i < n; i++) {
        if (v.charAt(i) == ch) {
          if (start >= i) {
            ret[cnt]="";
          }
     else {
            ret[cnt]=v.substring(start,i);
            if (trim)         ret[cnt]=ret[cnt].trim();
          }
          cnt++;
          start=i + 1;
          if (cnt == splits)       break;
        }
      }
      ret[cnt]=v.substring(start);
      if (trim)   ret[cnt]=ret[cnt].trim();
      return ret;
    }

    String[] method2(String s,char c,boolean trim){
      int i, b, e;
      int cnt;
      String res[];
      int ln=s.length();
      i=0;
      cnt=1;
      while ((i=s.indexOf(c,i)) != -1) {
        cnt++;
        i++;
      }
      res=new String[cnt];
      i=0;
      b=0;
      while (b <= ln) {
        e=s.indexOf(c,b);
        if (e == -1) {
          e=ln;
        }
        if (!trim) {
          res[i++]=s.substring(b,e);
        }
     else {
          int e2=e - 1;
          while (e2 >= 0 && Character.isWhitespace(s.charAt(e2))) {
            e2--;
          }
          e2++;
          while (b < ln && Character.isWhitespace(s.charAt(b))) {
            b++;
          }
          if (b < e) {
            res[i++]=s.substring(b,e2);
          }
     else {
            res[i++]="";
          }
        }
        b=e + 1;
      }
      return res;
    }
}
