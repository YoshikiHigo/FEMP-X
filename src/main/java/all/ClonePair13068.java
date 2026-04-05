package all;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClonePair13068 {

    String[] method1(String sCommandLine){
      char[] vc=sCommandLine.trim().toCharArray();
      char[] vcTmp=new char[vc.length];
      boolean bOpenQuote=false;
      List vArgs=new ArrayList();
      int iLen=0;
      for (int i=0; i < vc.length; i++) {
        if (vc[i] == '\'' || vc[i] == '\"') {
          bOpenQuote=!bOpenQuote;
          continue;
        }
        if (vc[i] == ' ' && !bOpenQuote) {
          vArgs.add(new String(vcTmp,0,iLen));
          iLen=0;
          vcTmp=new char[vc.length];
          continue;
        }
        vcTmp[iLen++]=vc[i];
      }
      if (iLen != 0)   vArgs.add(new String(vcTmp,0,iLen));
      String[] vsRes=new String[vArgs.size()];
      int i=0;
      for (Iterator iter=vArgs.iterator(); iter.hasNext(); )   vsRes[i++]=(String)iter.next();
      return vsRes;
    }

    String[] method2(String args){
      List<String> arguments=new ArrayList<String>();
      boolean quoted=false;
      String currentArg="";
      for (int i=0; i < args.length(); i++) {
        char c=args.charAt(i);
        if (!quoted && c == ' ') {
          arguments.add(currentArg);
          currentArg="";
        }
     else     if (quoted && c == '"') {
          arguments.add(currentArg);
          currentArg="";
          quoted=false;
          i++;
        }
     else     if (c == '"') {
          quoted=true;
        }
     else {
          currentArg+=c;
        }
        if (i == args.length() - 1) {
          arguments.add(currentArg);
        }
      }
      String[] toReturn=new String[arguments.size()];
      for (int i=0; i < arguments.size(); i++) {
        toReturn[i]=arguments.get(i);
      }
      return toReturn;
    }
}
