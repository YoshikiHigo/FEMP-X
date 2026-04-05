package all;

import java.util.*;

public class ClonePair6613 {

    String method1(String text,List<String> lineArray,Map<String,Integer> lineHash){
      int lineStart=0;
      int lineEnd=-1;
      String line;
      StringBuilder chars=new StringBuilder();
      while (lineEnd < text.length() - 1) {
        lineEnd=text.indexOf('\n',lineStart);
        if (lineEnd == -1) {
          lineEnd=text.length() - 1;
        }
        line=text.substring(lineStart,lineEnd + 1);
        lineStart=lineEnd + 1;
        if (lineHash.containsKey(line)) {
          chars.append(String.valueOf((char)(int)lineHash.get(line)));
        }
     else {
          lineArray.add(line);
          lineHash.put(line,lineArray.size() - 1);
          chars.append(String.valueOf((char)(lineArray.size() - 1)));
        }
      }
      return chars.toString();
    }

    String method2(String text,List<String> lineList,Map<String,Integer> lineIndexHash){
      int lineStart=0;
      int lineEnd=-1;
      String line;
      StringBuilder lineIndices=new StringBuilder();
      while (lineEnd < text.length() - 1) {
        lineEnd=text.indexOf('\n',lineStart);
        if (lineEnd == -1) {
          lineEnd=text.length() - 1;
        }
        line=text.substring(lineStart,lineEnd + 1);
        lineStart=lineEnd + 1;
        if (lineIndexHash.containsKey(line)) {
          lineIndices.append(String.valueOf((char)lineIndexHash.get(line).intValue()));
        }
     else {
          lineList.add(line);
          lineIndexHash.put(line,lineList.size() - 1);
          lineIndices.append(String.valueOf((char)(lineList.size() - 1)));
        }
      }
      return lineIndices.toString();
    }
}
