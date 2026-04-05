package unverified;

public class ClonePair10798 {

    String method1(String in,String t1,String t2){
      StringBuffer result=new StringBuffer();
      int i=0;
      while (i < in.length()) {
        if (in.startsWith(t1,i)) {
          result.append(t2);
          if (t1.length() == 0) {
            result.append(in.charAt(i));
            i++;
          }
     else       i+=t1.length();
        }
     else {
          result.append(in.charAt(i));
          i++;
        }
      }
      return result.toString();
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
