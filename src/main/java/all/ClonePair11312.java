package all;

public class ClonePair11312 {

    String method1(String s,int places){
      int j=places - s.length();
      if (j > 0) {
        StringBuffer sb=null;
        sb=new StringBuffer(j);
        for (int k=0; k < j; k++) {
          sb.append(' ');
        }
        return sb.toString() + s;
      }
     else {
        return s;
      }
    }

    String method2(String s,int length){
      char[] cs=s.toCharArray();
      int count=0;
      for (int i=0; i < cs.length; i++) {
        char c=cs[i];
        if (c <= 127)     count++;
     else     count+=2;
      }
      int sp=length - count;
      if (sp > 0) {
        char[] spaces=new char[sp];
        for (int i=0; i < spaces.length; i++)     spaces[i]=' ';
        return s + new String(spaces);
      }
      return s;
    }
}
