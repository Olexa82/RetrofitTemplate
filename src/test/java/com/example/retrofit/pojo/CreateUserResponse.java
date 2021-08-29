package com.example.retrofit.pojo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Alex on 28.08.2021
 * retrofit
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateUserResponse {
    @JsonProperty("createAt")
    private String createAt;

    @JsonProperty("id")
    private String id;

    @JsonProperty("job")
    private String job;

    @JsonProperty("name")
    private String name;

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CreateUserResponse{" +
                "createAt='" + createAt + '\'' +
                ", id='" + id + '\'' +
                ", job='" + job + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
