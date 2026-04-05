package all;

public class ClonePair10952 {

    String method1(String line,String replacement,String tok){
      StringBuffer res=new StringBuffer(line);
      char[] tokChars=tok.toCharArray();
      for (int i=0; i < res.length() - tok.length() + 1; i++) {
        boolean match=true;
        for (int k=0; k < tok.length(); k++) {
          if (res.charAt(i + k) != tokChars[k]) {
            match=false;
            break;
          }
        }
        if (match) {
          res.replace(i,i + tok.length(),replacement);
        }
      }
      return res.toString();
    }

    String method2(String src,String atStr,String dst){
      String temp=src;
      for (int i=temp.indexOf(atStr); i > 0; ) {
        temp=temp.substring(0,i) + dst + temp.substring(i + atStr.length());
      }
      return temp;
    }
}
