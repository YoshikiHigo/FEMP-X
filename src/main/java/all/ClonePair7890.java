package all;

public class ClonePair7890 {

    int method1(StringBuffer buf,int start,String[] targets){
      for (int i=start; i < buf.length(); i++) {
        for (int j=0; j < targets.length; j++) {
          if (i < buf.length() - targets[j].length()) {
            String match=buf.substring(i,i + targets[j].length());
            if (targets[j].equalsIgnoreCase(match))         return i;
          }
        }
      }
      return -1;
    }

    int method2(StringBuffer buf,int start,String[] targets){
      for (int i=start; i < buf.length(); i++) {
        for (int j=0; j < targets.length; j++) {
          if (i < buf.length() - targets[j].length()) {
            String match=buf.substring(i,i + targets[j].length());
            if (targets[j].equals(match))         return i;
          }
        }
      }
      return -1;
    }
}
