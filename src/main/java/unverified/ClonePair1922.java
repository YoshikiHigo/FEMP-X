package unverified;

public class ClonePair1922 {

    String method1(byte[] bytes){
      StringBuffer sb=new StringBuffer();
      String s;
      int i;
      for (i=0; i < bytes.length; i++) {
        if (i % 32 == 0 && i != 0)     sb.append("\n");
        s=Integer.toHexString(bytes[i]);
        if (s.length() < 2)     s="0" + s;
        if (s.length() > 2)     s=s.substring(s.length() - 2);
        sb.append(s);
      }
      return sb.toString();
    }

    String method2(byte[] bytes){
      int i;
      StringBuffer sb=new StringBuffer();
      for (i=0; i < bytes.length; i++) {
        if (i % 32 == 0 && i != 0) {
          sb.append("\n");
        }
        String s=Integer.toHexString(bytes[i]);
        if (s.length() < 2) {
          s="0" + s;
        }
        if (s.length() > 2) {
          s=s.substring(s.length() - 2);
        }
        sb.append(s);
      }
      return sb.toString();
    }
}
