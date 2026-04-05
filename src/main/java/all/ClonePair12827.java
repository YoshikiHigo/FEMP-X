package all;

public class ClonePair12827 {

    String method1(String[] args,int start){
      StringBuffer buf=new StringBuffer();
      for (int i=start; i < args.length; ++i) {
        if (buf.length() > 0)     buf.append(' ');
        buf.append(args[i]);
      }
      return buf.toString();
    }

    String method2(String[] args,int start){
      StringBuilder sb=new StringBuilder();
      for (int i=start; i < args.length; i++) {
        sb.append(args[i]);
        sb.append(" ");
      }
      return sb.toString().trim();
    }
}
