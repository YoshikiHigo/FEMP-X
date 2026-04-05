package all;

public class ClonePair4777 {

    String method1(String phrase,char value,int size){
      StringBuffer buf=new StringBuffer();
      for (int i=0; i < (size - (phrase.length())); i++) {
        buf.append(value);
      }
      buf.append(phrase);
      return buf.toString();
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
