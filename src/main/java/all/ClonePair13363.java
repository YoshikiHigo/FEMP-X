package all;

public class ClonePair13363 {

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

    String method2(String src,String from,String to){
      StringBuffer sb=new StringBuffer(src);
      int i1, i2, tail;
      int len=from.length();
      int fromIndex=0;
      while ((i1=src.indexOf(from,fromIndex)) != -1) {
        i2=i1 + len;
        tail=src.length() - i2;
        sb=sb.replace(i1,i2,to);
        src=new String(sb);
        fromIndex=src.length() - tail;
      }
      return new String(sb);
    }
}
