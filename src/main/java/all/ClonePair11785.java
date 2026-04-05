package all;

public class ClonePair11785 {

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

    String method2(String input,String replace,String replacement){
      int idx;
      if ((idx=input.indexOf(replace)) == -1) {
        return input;
      }
      StringBuffer returning=new StringBuffer();
      while (idx != -1) {
        returning.append(input.substring(0,idx));
        returning.append(replacement);
        input=input.substring(idx + replace.length());
        idx=input.indexOf(replace);
      }
      returning.append(input);
      return returning.toString();
    }
}
