package all;

public class ClonePair6117 {

    double[] method1(String s,int wanted,char delimChar){
      double[] values=new double[wanted];
      int count=0;
      try {
        int start=0;
        int delim=0;
        int l=s.length();
        while (count < wanted) {
          if (delim >= l || s.charAt(delim) == delimChar) {
            values[count++]=Double.parseDouble(s.substring(start,delim));
            ++delim;
            start=delim;
            if (delim >= l) {
              break;
            }
          }
     else {
            ++delim;
          }
        }
      }
     catch (  NumberFormatException e) {
        e.printStackTrace(System.err);
        count=0;
      }
      return count != wanted ? null : values;
    }

    double[] method2(String s,int wanted,char delimChar){
      double[] values=new double[wanted];
      int count=0;
      try {
        int start=0;
        int delim=0;
        int l=s.length();
        while (count < wanted) {
          if (delim >= l || s.charAt(delim) == delimChar) {
            values[count++]=Double.parseDouble(s.substring(start,delim));
            ++delim;
            start=delim;
            if (delim >= l)         break;
          }
     else {
            ++delim;
          }
        }
      }
     catch (  NumberFormatException e) {
        e.printStackTrace(System.err);
        count=0;
      }
      return count != wanted ? null : values;
    }
}
