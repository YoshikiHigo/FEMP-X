package all;

public class ClonePair13361 {

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

    String method2(String s,String sub,String with){
      int c=0;
      int i=s.indexOf(sub,c);
      if (i == -1)   return s;
      StringBuffer buf=new StringBuffer(s.length() + with.length());
    synchronized (buf) {
        do {
          buf.append(s.substring(c,i));
          buf.append(with);
          c=i + sub.length();
        }
     while ((i=s.indexOf(sub,c)) != -1);
        if (c < s.length()) {
          buf.append(s.substring(c,s.length()));
        }
        return buf.toString();
      }
    }
}
