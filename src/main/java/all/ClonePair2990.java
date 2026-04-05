package all;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class ClonePair2990 {

    String[] method1(String prop,String separator){
      if (prop == null || prop.trim().equals("")) {
        return new String[0];
      }
      ArrayList list=new ArrayList();
      StringTokenizer tokens=new StringTokenizer(prop,separator);
      while (tokens.hasMoreTokens()) {
        String token=tokens.nextToken().trim();
        if (!token.equals("")) {
          list.add(token);
        }
      }
      return list.isEmpty() ? new String[0] : (String[])list.toArray(new String[list.size()]);
    }

    String[] method2(String prop,String separator){
      if (prop == null || prop.trim().equals(""))   return new String[0];
      ArrayList list=new ArrayList();
      StringTokenizer tokens=new StringTokenizer(prop,separator);
      while (tokens.hasMoreTokens()) {
        String token=tokens.nextToken().trim();
        if (!token.equals(""))     list.add(token);
      }
      return list.isEmpty() ? new String[0] : (String[])list.toArray(new String[list.size()]);
    }
}
