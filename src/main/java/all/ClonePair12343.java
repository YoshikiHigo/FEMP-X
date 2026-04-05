package all;

public class ClonePair12343 {

    String method1(String str,String innerString,String with){
      int c=0;
      int i=str.indexOf(innerString,c);
      if (i == -1) {
        return str;
      }
      StringBuffer buf=new StringBuffer(str.length() + with.length());
    synchronized (buf) {
        do {
          buf.append(str.substring(c,i));
          buf.append(with);
          c=i + innerString.length();
        }
     while ((i=str.indexOf(innerString,c)) != -1);
        if (c < str.length()) {
          buf.append(str.substring(c,str.length()));
        }
        return buf.toString();
      }
    }

    String method2(String line,String oldString,String newString){
      int i=0;
      if ((i=line.indexOf(oldString,i)) >= 0) {
        char line2[]=line.toCharArray();
        char newString2[]=newString.toCharArray();
        int oLength=oldString.length();
        StringBuffer buf=new StringBuffer(line2.length);
        buf.append(line2,0,i).append(newString2);
        i+=oLength;
        int j;
        for (j=i; (i=line.indexOf(oldString,i)) > 0; j=i) {
          buf.append(line2,j,i - j).append(newString2);
          i+=oLength;
        }
        buf.append(line2,j,line2.length - j);
        return buf.toString();
      }
     else {
        return line;
      }
    }
}
