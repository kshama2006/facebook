package io.github.kshama2006.facebook.accounts;

import java.util.Objects;

public class Account {
    private Long id;
    private String name;
    private String chat;
    private String call;
    private String story;
    private String likes;
    private String dislikes;
    private String comments;
    private String profile;


    public Account() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account accounts = (Account) o;
        return Objects.equals(getId(), accounts.getId()) && Objects.equals(getName(), accounts.getName()) && Objects.equals(getChat(), accounts.getChat()) && Objects.equals(getCall(), accounts.getCall()) && Objects.equals(getStory(), accounts.getStory()) && Objects.equals(getLikes(), accounts.getLikes()) && Objects.equals(getDislikes(), accounts.getDislikes()) && Objects.equals(getComments(), accounts.getComments()) && Objects.equals(getProfile(), accounts.getProfile());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getChat(), getCall(), getStory(), getLikes(), getDislikes(), getComments(), getProfile());
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", chat='" + chat + '\'' +
                ", call='" + call + '\'' +
                ", story='" + story + '\'' +
                ", likes='" + likes + '\'' +
                ", dislikes='" + dislikes + '\'' +
                ", comments='" + comments + '\'' +
                ", profile='" + profile + '\'' +
                '}';
    }

    public Account(Long id, String name, String chat, String call, String story, String likes, String dislikes, String comments, String profile) {
        this.id = id;
        this.name = name;
        this.chat = chat;
        this.call = call;
        this.story = story;
        this.likes = likes;
        this.dislikes = dislikes;
        this.comments = comments;
        this.profile = profile;


    }
}
