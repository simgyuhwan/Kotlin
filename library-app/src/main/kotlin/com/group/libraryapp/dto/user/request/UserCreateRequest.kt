package com.group.libraryapp.dto.user.request;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class UserCreateRequest {
  private String name;
  private Integer age;

  @NotNull
  public String getName() {
    return name;
  }

  @Nullable
  public Integer getAge() {
    return age;
  }

  public UserCreateRequest(String name, Integer age) {
    this.name = name;
    this.age = age;
  }
}
