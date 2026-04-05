package all;

public class ClonePair4812 {

    String method1(String s,char c,int length){
      StringBuilder result=new StringBuilder();
      result.append(s);
      int delta=length - s.length();
      for (int i=0; i < delta; i++) {
        result.append(c);
      }
      return result.toString();
    }

    String method2(String s,char c,int l){
      if (s.length() < l) {
        StringBuffer sb=new StringBuffer();
        for (int i=0; i < l - s.length(); i++) {
          sb.append(c);
        }
        return s + sb.toString();
      }
      return s;
    }
}
