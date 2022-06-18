package me.designpattern._02_structural_patterns._09_decorator._02_after;

public class App {

    private static final boolean enabledSpamFilter = false;

    private static final boolean enabledTrimming = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if (enabledSpamFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        if (enabledTrimming) {
            commentService = new TrimmingCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("1...");
        client.writeComment("2.....");
        client.writeComment("http://naver.com");

    }

}
