package oopLecture;

import java.util.Date;

public class Post {

    public static String nameOfBlog = "Justin's Blog";
    public static int noOfSiteViews;

    private int noOfPostViews;
    private Date createdAt;
    private Date editedAt;
    private String title;
    private String content;
    private String category;
    private Person author;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }


    public void printSummary() {
        System.out.printf("Title: %s%nContent: %s", this.title, this.content);
    }

    public static String returnLongerPostTitle(Post p1, Post p2) {
        if (p1.title.length() > p2.title.length()) {
            return p1.title;
        } else {
            return p2.title;
        }
    }

    public static void main(String[] args) {
        Post post1 = new Post();
        post1.title = "This is a Name";

        Post post2 = new Post();
        post2.title = "Short Name";

        String longerTitle = Post.returnLongerPostTitle(post1, post2);
        System.out.println(longerTitle);
    }

}
