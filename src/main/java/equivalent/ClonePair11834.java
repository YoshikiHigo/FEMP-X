package equivalent;

public class ClonePair11834 {
    String method1(String beCutStr, String beignStr, String endStr) {
        String cuttedStr = "";
        int indexBegin = beCutStr.indexOf(beignStr);
        int indexEnd = beCutStr.indexOf(endStr, indexBegin);
        if (indexBegin != -1 && indexEnd != -1) {
            cuttedStr = beCutStr.substring(indexBegin + beignStr.length(), indexEnd);
        }
        return cuttedStr;
    }

    String method2(String source, String start, String end) {
        int i = source.indexOf(start);
        int j = source.indexOf(end);
        if (i > -1 && j > -1) {
            return source.substring(i + start.length(), j);
        }
        return "";
    }
}
