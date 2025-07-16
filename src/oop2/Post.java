package oop2;

public class Post {
    String name;
    String comments;
    int like;
    int capacity;

    public Post(String name, String comments, int like, int capacity) {
        this.name = name;
        this.comments = comments;
        this.like = like;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Post{" +
                "name='" + name + '\'' +
                ", comments='" + comments + '\'' +
                ", like=" + like +
                ", capacity=" + capacity +
                '}';
    }
}
