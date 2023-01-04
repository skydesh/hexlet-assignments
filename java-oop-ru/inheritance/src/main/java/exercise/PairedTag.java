package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class PairedTag extends Tag{
    private List<Tag> children;
    private String tagBody;

    public PairedTag(String tag, Map<String, String> attributes, String tagBody, List<Tag> children ) {
        super(tag, attributes);
        this.children = children;
        this.tagBody = tagBody;
    }

    @Override
    public String toString() {
        if (children.size() == 0) {
            return super.toString() + this.tagBody + "</" + super.getTag() + ">";
        }
        List<String> children2 = children.stream()
                .map(Tag::toString)
                .toList();
        StringBuilder collectionString = new StringBuilder();
        for (String entry : children2) {
            collectionString.append(entry);
        }
        return super.toString() + this.tagBody + collectionString + "</" + super.getTag() + ">";
    }
}
// BEGIN

// END
