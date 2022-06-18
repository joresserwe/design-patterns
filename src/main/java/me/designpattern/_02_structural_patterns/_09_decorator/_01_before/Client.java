package me.designpattern._02_structural_patterns._09_decorator._01_before;

public class Client {

    private final CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public static void main(String[] args) {
        // Client client = new Client(new CommentService());
        Client client = new Client(new TrimmingCommentService());
        client.writeComment("11.....");
        client.writeComment("22...");
    }
}
