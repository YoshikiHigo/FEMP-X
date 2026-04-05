package unverified;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClonePair13069 {

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

    String[] method2(String sCommandLine){
      char[] vc=sCommandLine.trim().toCharArray();
      char[] vcTmp=new char[vc.length];
      boolean bOpenQuote=false;
      List<String> vArgs=new ArrayList<String>();
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
      for (  String s : vArgs)   vsRes[i++]=s;
      return vsRes;
    }
}
