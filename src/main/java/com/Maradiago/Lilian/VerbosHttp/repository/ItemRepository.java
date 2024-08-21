package com.Maradiago.Lilian.VerbosHttp.repository;

import com.Maradiago.Lilian.VerbosHttp.model.GroceryItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends MongoRepository<GroceryItem, String>{



}
