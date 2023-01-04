package exercise;

import java.util.stream.Collectors;
import java.util.Map;
public abstract class Tag {
    private String tag;
    private Map<String, String> attributes;

    public Tag(String tag, Map<String, String> attributes) {
        this.tag = tag;
        this.attributes = attributes;
    }

    public String getTag() {
        return tag;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    @Override
    public String toString() {
        StringBuilder collectionString = new StringBuilder();
        collectionString.append("<").append(this.tag);
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            collectionString.append(" ")
                    .append(entry.getKey())
                    .append("=\"")
                    .append(entry.getValue())
                    .append("\"");
        }
        collectionString.append(">");
        return collectionString.toString();
    }
}
// BEGIN

// END
