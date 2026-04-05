package all;

public class ClonePair11252 {

    String method1(String mn,String pat,String wit){
      try {
        String wit2;
        if (wit == null)     wit="";
        if (pat == null)     return mn;
        if (mn == null)     return "";
        int indx=mn.indexOf(pat);
        if (indx < 0)     return mn;
        wit2=mn.substring(0,indx) + wit;
        mn=wit2 + mn.substring(indx + pat.length(),mn.length());
      }
     catch (  Exception e) {
        e.printStackTrace();
      }
      return mn;
    }

    String method2(String mn,String pat,String wit){
      try {
        String wit2;
        if (wit == null)     wit="";
        if (pat == null)     return mn;
        if (mn == null)     return "";
        int indx=mn.lastIndexOf(pat);
        if (indx < 0)     return mn;
        wit2=mn.substring(0,indx) + wit;
        mn=wit2 + mn.substring(indx + pat.length(),mn.length());
      }
     catch (  Exception e) {
        e.printStackTrace();
      }
      return mn;
    }
}
