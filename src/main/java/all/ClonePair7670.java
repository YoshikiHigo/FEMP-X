package all;

import java.util.*;

public class ClonePair7670 {

    String method1(String s,Vector prefixes){
      if (s == null)   return null;
      for (int i=0; i < prefixes.size(); i++) {
        String prefix=(String)prefixes.get(i);
        if (s.toLowerCase().startsWith(prefix.toLowerCase()))     s=s.substring(prefix.length());
      }
      return s;
    }

    String method2(String s,Vector suffixes){
      if (s == null)   return null;
      for (int i=0; i < suffixes.size(); i++) {
        String suffix=(String)suffixes.get(i);
        if (s.toLowerCase().endsWith(suffix.toLowerCase()))     s=s.substring(0,s.length() - suffix.length());
      }
      return s;
    }
}
