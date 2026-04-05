package all;

import java.util.ArrayList;
import java.util.List;

public class ClonePair11459 {

    List<String> method1(String s,int width){
      List<String> lines=new ArrayList<String>();
      int offset=0;
      final int slength=s.length();
      int remaining=s.length();
      while (remaining > 0) {
        int splitPos=-1;
        int truncateCount=0;
        int lastPosAtLine=offset + width;
        if (lastPosAtLine >= slength) {
          lastPosAtLine=slength - 1;
        }
        boolean forcedBreak=false;
        for (int i=offset; i <= lastPosAtLine; i++) {
          char ch=s.charAt(i);
          if (ch == '\r') {
            splitPos=i;
            truncateCount=1;
            if (i < slength - 1 && '\n' == s.charAt(i + 1)) {
              truncateCount++;
            }
            forcedBreak=true;
            break;
          }
     else       if (ch == '\n') {
            splitPos=i;
            truncateCount=1;
            forcedBreak=true;
            break;
          }
     else       if (Character.isWhitespace(ch)) {
            splitPos=i;
            truncateCount=1;
          }
        }
        if (splitPos < 0) {
          splitPos=lastPosAtLine;
          truncateCount=0;
        }
        if (!forcedBreak) {
          if (remaining <= width) {
            splitPos=offset + remaining;
          }
        }
        int jumpLength=(splitPos - offset) + truncateCount;
        lines.add(s.substring(offset,splitPos));
        offset+=jumpLength;
        remaining-=jumpLength;
      }
      return lines;
    }

    List<String> method2(String text,int charactersPerLine){
      int textSize=text.length(), off=0;
      final List<String> list=new ArrayList<String>();
      while (true) {
        int indent;
        for (indent=0; indent < textSize; indent++) {
          if (text.charAt(off + indent) != ' ') {
            break;
          }
        }
        textSize-=indent;
        off+=indent;
        if (textSize <= 0) {
          break;
        }
        final int lineSize;
        if (textSize <= charactersPerLine) {
          lineSize=textSize;
        }
     else {
          int lim=charactersPerLine;
          for (int i=charactersPerLine; i > 0; i--) {
            if (text.charAt(off + i) == ' ') {
              lim=i;
              break;
            }
          }
          lineSize=lim;
        }
        list.add(text.substring(off,lineSize + off));
        textSize-=lineSize;
        off+=lineSize;
      }
      return list;
    }
}
