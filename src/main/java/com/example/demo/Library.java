package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;

@Entity
@Getter
public class Library {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String name;

  // the association is owned by the Library end of the association
  // i.e. the Library will contain the foreign key

  @OneToOne
  // @JoinColumn(name = "address_id") // foreign key column default address
  //
  // default path is `library`, i.e. `http://localhost:8081/api/libraries/1/address`;
  // setting `rel` (association name) is recommended to avoid `JsonMappingException`
  // which occurs when multiple association resources have the same name
  // association name defaults to the property name
  // @RestResource(path = "libraryAddress", rel="address")
  private Address address;
}
