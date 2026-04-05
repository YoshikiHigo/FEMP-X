package all;

public class ClonePair12209 {

    String method1(String line,String oldString,String newString){
      int i=0;
      if ((i=line.indexOf(oldString,i)) >= 0) {
        char[] line2=line.toCharArray();
        char[] newString2=newString.toCharArray();
        int oLength=oldString.length();
        StringBuffer buf=new StringBuffer(line2.length);
        buf.append(line2,0,i).append(newString2);
        i+=oLength;
        int j=i;
        while ((i=line.indexOf(oldString,i)) > 0) {
          buf.append(line2,j,i - j).append(newString2);
          i+=oLength;
          j=i;
        }
        buf.append(line2,j,line2.length - j);
        return buf.toString();
      }
      return line;
    }

    String method2(String s,String before,String after){
      StringBuilder buff=new StringBuilder(s.length());
      int index=0;
      while (true) {
        int next=s.indexOf(before,index);
        if (next < 0) {
          buff.append(s.substring(index));
          break;
        }
        buff.append(s.substring(index,next)).append(after);
        index=next + before.length();
      }
      return buff.toString();
    }
}
