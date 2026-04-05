package all;

public class ClonePair12459 {

    String method1(String toSearch,String find,String replace){
      if (find == null || toSearch == null || toSearch.indexOf(find) == -1)   return toSearch;
      if (replace == null)   replace="";
      int marker=0, findPos, findLen=find.length();
      StringBuilder sb=new StringBuilder();
      while ((findPos=toSearch.indexOf(find,marker)) > -1) {
        sb.append(toSearch.substring(marker,findPos));
        sb.append(replace);
        marker=findPos + findLen;
      }
      sb.append(toSearch.substring(marker));
      return sb.toString();
    }

    String method2(String in,String old,String neww){
      int b=0;
      if (in == null || old == null || neww == null || (b=in.indexOf(old)) == -1 || old.length() == 0) {
        return in;
      }
      int oldLength=old.length();
      StringBuffer mod=new StringBuffer(in.length());
      mod.append(in.substring(0,b));
      int e=in.indexOf(old,b + oldLength);
      while (e != -1) {
        mod.append(neww);
        mod.append(in.substring(b + oldLength,e));
        b=e;
        e=in.indexOf(old,b + oldLength);
      }
      mod.append(neww);
      if (b < in.length()) {
        mod.append(in.substring(b + oldLength));
      }
      return mod.toString();
    }
}
