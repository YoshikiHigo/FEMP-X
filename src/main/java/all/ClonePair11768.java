package all;

public class ClonePair11768 {

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

    String method2(String input,String search,String replacement){
      int pos=input.indexOf(search);
      if (pos != -1) {
        int lastPos=pos;
        while (true) {
          pos=input.indexOf(search,lastPos + 1);
          if (pos == -1) {
            break;
          }
     else {
            lastPos=pos;
          }
        }
        input=input.substring(0,lastPos) + replacement + input.substring(lastPos + search.length());
      }
      return input;
    }
}
