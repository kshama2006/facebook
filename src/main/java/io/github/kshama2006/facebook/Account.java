package io.github.kshama2006.facebook;

import java.util.Objects;

public class Account {
    private String name;
    private Long id;
    private String chat;
    private String call;
    private String story;
    private String likes;
    private String dislikes;
    private String profile;
    private String comments;

    public Account() {

    }

    public Account(Long id, String chat, String call, String story, String likes, String dislikes, String profile, String comments, String name) {
        this.id = id;
        this.chat = chat;
        this.call = call;
        this.story = story;
        this.likes = likes;
        this.dislikes = dislikes;
        this.profile = profile;
        this.comments = comments;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getDislikes() {
        return dislikes;
    }

    public void setDislikes(String dislikes) {
        this.dislikes = dislikes;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(getName(), account.getName()) && Objects.equals(getId(), account.getId()) && Objects.equals(getChat(), account.getChat()) && Objects.equals(getCall(), account.getCall()) && Objects.equals(getStory(), account.getStory()) && Objects.equals(getLikes(), account.getLikes()) && Objects.equals(getDislikes(), account.getDislikes()) && Objects.equals(getProfile(), account.getProfile()) && Objects.equals(getComments(), account.getComments());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId(), getChat(), getCall(), getStory(), getLikes(), getDislikes(), getProfile(), getComments());
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", chat='" + chat + '\'' +
                ", call='" + call + '\'' +
                ", story='" + story + '\'' +
                ", likes='" + likes + '\'' +
                ", dislikes='" + dislikes + '\'' +
                ", profile='" + profile + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
