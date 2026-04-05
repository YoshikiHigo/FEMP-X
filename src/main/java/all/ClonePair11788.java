package all;

public class ClonePair11788 {

    String method1(String in,String find,String newStr){
      final char[] working=in.toCharArray();
      final StringBuilder sb=new StringBuilder(in.length() + newStr.length());
      int startindex=in.indexOf(find);
      if (startindex < 0) {
        return in;
      }
      int currindex=0;
      while (startindex > -1) {
        for (int i=currindex; i < startindex; ++i) {
          sb.append(working[i]);
        }
        currindex=startindex;
        sb.append(newStr);
        currindex+=find.length();
        startindex=in.indexOf(find,currindex);
      }
      for (int i=currindex; i < working.length; ++i) {
        sb.append(working[i]);
      }
      return sb.toString();
    }

    String method2(String s,String s1,String s2){
      int i=s.length();
      int j=s1.length();
      int k=0;
      String s3=s;
      String s4="";
      do {
        if (i < j)     break;
        int l=s3.indexOf(s1,k);
        if (l == -1) {
          s4=s4 + s3.substring(k,i);
          break;
        }
        s4=s4 + s3.substring(k,l);
        s4=s4 + s2;
        s3=s3.substring(l + j,i);
        i=s3.length();
      }
     while (true);
      if (i < j)   s4=s4 + s3;
      return s4;
    }
}
