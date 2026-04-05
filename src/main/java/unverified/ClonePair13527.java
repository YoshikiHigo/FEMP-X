package unverified;

public class ClonePair13527 {

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

    String[] method2(String string){
      if (string.startsWith("[x]")) {
        return new String[]{"id=\"todo-done\"",string.substring(3).trim()};
      }
     else   if (string.startsWith("[!]")) {
        return new String[]{"id=\"todo-imp\"",string.substring(3).trim()};
      }
     else   if (string.startsWith("[ ]")) {
        return new String[]{"id=\"todo-normal\"",string.substring(3).trim()};
      }
      return new String[]{"",string};
    }
}
