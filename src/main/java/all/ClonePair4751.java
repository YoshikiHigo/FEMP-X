package all;

public class ClonePair4751 {

    String method1(String str,char ch,int length){
      if (str.length() < length) {
        StringBuffer sb=new StringBuffer(ch);
        for (int i=0; i < (length - str.length()); i++) {
          sb.append(ch);
        }
        sb.append(str);
        return sb.toString();
      }
     else {
        return str;
      }
    }

    String method2(String s,char c,int l){
      if (s.length() < l) {
        StringBuffer sb=new StringBuffer();
        for (int i=0; i < l - s.length(); i++) {
          sb.append(c);
        }
        sb.append(s);
        return sb.toString();
      }
      return s;
    }
}
