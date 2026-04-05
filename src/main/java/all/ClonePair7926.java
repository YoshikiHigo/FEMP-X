package all;

public class ClonePair7926 {

    String method1(String stringToReplaceIn,String stringToReplace,String replacedByString,boolean replaceEveryOccurrence){
      do {
        int stringToReplaceStartsAt=stringToReplaceIn.indexOf(stringToReplace);
        int stringToReplaceEndsAt=stringToReplaceStartsAt + stringToReplace.length();
        if (stringToReplaceStartsAt >= 0 && stringToReplaceEndsAt > stringToReplaceStartsAt) {
          String preceedingSubString=stringToReplaceIn.substring(0,stringToReplaceStartsAt);
          String succeedingSubString=stringToReplaceIn.substring(stringToReplaceEndsAt,stringToReplaceIn.length());
          stringToReplaceIn=preceedingSubString + replacedByString + succeedingSubString;
        }
      }
     while (stringToReplaceIn.indexOf(stringToReplace) >= 0 && replaceEveryOccurrence);
      return stringToReplaceIn;
    }

    String method2(String source,String pattern,String to,boolean caseSensitive){
      String workSource=(caseSensitive ? source : source.toLowerCase());
      pattern=(caseSensitive ? pattern : pattern.toLowerCase());
      int idx=workSource.indexOf(pattern);
      int length=pattern.length();
      StringBuffer dest=new StringBuffer("");
      while (idx >= 0) {
        dest.append(source.substring(0,idx));
        dest.append(to);
        workSource=workSource.substring(idx + length);
        if (!caseSensitive) {
          source=source.substring(idx + length);
        }
     else {
          source=workSource;
        }
        idx=workSource.indexOf(pattern);
      }
      dest.append(source);
      return dest.toString();
    }
}
