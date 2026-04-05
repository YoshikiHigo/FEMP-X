package unverified;

public class ClonePair13376 {

    String method1(String line,String oldString,String newString){
      int i=0;
      int j=0;
      if ((i=line.indexOf(oldString,i)) >= 0) {
        char line2[]=line.toCharArray();
        char newString2[]=newString.toCharArray();
        int oLength=oldString.length();
        StringBuffer buffer=new StringBuffer(line2.length);
        buffer.append(line2,0,i).append(newString2);
        i+=oLength;
        for (j=i; (i=line.indexOf(oldString,i)) > 0; j=i) {
          buffer.append(line2,j,i - j).append(newString2);
          i+=oLength;
        }
        buffer.append(line2,j,line2.length - j);
        return buffer.toString();
      }
     else {
        return line;
      }
    }

    String method2(String s,String find,String replace){
      int found=s.indexOf(find);
      if (found == -1) {
        return s;
      }
      StringBuffer sb=new StringBuffer(s.length());
      int start=0;
      for (; ; ) {
        for (; start < found; start++) {
          sb.append(s.charAt(start));
        }
        if (found == s.length()) {
          break;
        }
        sb.append(replace);
        start+=find.length();
        found=s.indexOf(find,start);
        if (found == -1) {
          found=s.length();
        }
      }
      return sb.toString();
    }
}
