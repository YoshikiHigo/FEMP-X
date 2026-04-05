package unverified;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClonePair13074 {

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

    String[] method2(String str){
      List<String> bits=new ArrayList<String>();
      char quote=' ';
      boolean escape=false;
      boolean bit_contains_quotes=false;
      String bit="";
      char[] chars=str.toCharArray();
      for (int i=0; i < chars.length; i++) {
        char c=chars[i];
        if (Character.isWhitespace(c)) {
          c=' ';
        }
        if (escape) {
          bit+=c;
          escape=false;
          continue;
        }
     else     if (c == '\\') {
          escape=true;
          continue;
        }
        if (c == '"' || c == '\'' && (i == 0 || chars[i - 1] != '\\')) {
          if (quote == ' ') {
            bit_contains_quotes=true;
            quote=c;
          }
     else       if (quote == c) {
            quote=' ';
          }
     else {
            bit+=c;
          }
        }
     else {
          if (quote == ' ') {
            if (c == ' ') {
              if (bit.length() > 0 || bit_contains_quotes) {
                bit_contains_quotes=false;
                bits.add(bit);
                bit="";
              }
            }
     else {
              bit+=c;
            }
          }
     else {
            bit+=c;
          }
        }
      }
      if (quote != ' ') {
        bit+=quote;
      }
      if (bit.length() > 0 || bit_contains_quotes) {
        bits.add(bit);
      }
      return (bits.toArray(new String[bits.size()]));
    }
}
