package com.nepow.ggumi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

  @Id
  @Column(name = "user_id")
  private String userId;
  @Column(name = "user_name")
  private String userName;
}
