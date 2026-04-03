package equivalent;

public class ClonePair12774 {
    String method1(String src, String ori, String tar) {
        String result = null;
        if (src != null && ori != null && tar != null) {
            try {
                StringBuffer source = new StringBuffer(src);
                int appearedIndex = 0;
                int oriLength = ori.length();
                int tarLength = tar.length();
                int byPassingIndex = 0;
                while (source.indexOf(ori, byPassingIndex) != -1) {
                    appearedIndex = source.indexOf(ori, byPassingIndex);
                    if (ori.equals(source.substring(appearedIndex, appearedIndex + oriLength))) {
                        source = source.replace(appearedIndex, appearedIndex + oriLength, tar);
                        byPassingIndex = appearedIndex + tarLength;
                    } else {
                        byPassingIndex = appearedIndex;
                    }
                }
                result = source.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    String method2(String str, String strToReplace, String replaceStr) {
        if (str == null || strToReplace == null || replaceStr == null) return null;
        StringBuffer sb = new StringBuffer();
        for (int replaceIndex = -1; (replaceIndex = str.indexOf(strToReplace)) > -1; ) {
            sb.append(str.substring(0, replaceIndex) + replaceStr);
            str = str.substring(replaceIndex + strToReplace.length());
        }
        sb.append(str);
        return sb.toString();
    }
}
