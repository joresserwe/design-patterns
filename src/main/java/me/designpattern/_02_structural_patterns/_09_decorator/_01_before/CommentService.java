package me.designpattern._02_structural_patterns._09_decorator._01_before;

public class CommentService {

    /**
     * 출력 전 Trim을 하고 싶다.
     */
    public void addComment(String comment) {
        System.out.println(comment);
    }
}
