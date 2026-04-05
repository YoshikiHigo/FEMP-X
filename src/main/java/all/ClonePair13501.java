package all;

public class ClonePair13501 {

    String[] method1(String hname){
      String ans[]=new String[2];
      int n=hname.lastIndexOf('.');
      if (n < 0) {
        ans[0]="";
        ans[1]=hname;
      }
     else {
        ans[0]=hname.substring(0,n);
        ans[1]=n < hname.length() - 1 ? hname.substring(n + 1) : "";
      }
      return ans;
    }

    String[] method2(String key){
      char[] cs=key.toCharArray();
      StringBuilder pkg=new StringBuilder();
      for (  char c : cs) {
        if (c == '\\' || c == '/') {
          if (pkg.length() != 0) {
            pkg.append(".");
          }
        }
     else     if (c == '.') {
          pkg.append("_");
        }
     else     if (c == ' ') {
          pkg.append("__");
        }
     else {
          pkg.append(c);
        }
      }
      int lastPeriodIndex=pkg.lastIndexOf(".");
      if (lastPeriodIndex == -1) {
        return new String[]{"",pkg.toString()};
      }
      return new String[]{pkg.substring(0,lastPeriodIndex),pkg.substring(lastPeriodIndex + 1)};
    }
}
