package all;

public class ClonePair12213 {

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

    String method2(String destination,String what,String with){
      if (destination.indexOf(what) >= 0) {
        StringBuffer buf=new StringBuffer();
        int last=0;
        int current=destination.indexOf(what);
        int whatLength=what.length();
        while (current >= 0) {
          if (current > 0) {
            buf.append(destination.substring(last,current));
          }
          buf.append(with);
          last=current + whatLength;
          current=destination.indexOf(what,last);
        }
        if (destination.length() > last) {
          buf.append(destination.substring(last));
        }
        return buf.toString();
      }
      return destination;
    }
}
