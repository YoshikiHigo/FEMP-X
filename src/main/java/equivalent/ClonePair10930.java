package equivalent;

public class ClonePair10930 {
    String method1(String string, int maxLength, String suffix) {
        StringBuilder builder = new StringBuilder(string);
        if (builder.length() > maxLength) {
            builder.setLength(maxLength);
            if (suffix != null) builder.append(suffix);
        }
        return builder.toString();
    }

    String method2(String _string, int _len, String _append) {
        StringBuffer _buffer = new StringBuffer(_string);
        if (_string.length() > _len) {
            _buffer.setLength(_len);
            String _truncated_string = _buffer.toString();
            if (_append != null) _truncated_string += _append;
            return _truncated_string;
        }
        return _string;
    }
}
