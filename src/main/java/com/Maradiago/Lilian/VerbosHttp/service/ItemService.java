package com.Maradiago.Lilian.VerbosHttp.service;

import com.Maradiago.Lilian.VerbosHttp.model.GroceryItem;
import com.Maradiago.Lilian.VerbosHttp.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemRepository itemRepository;

    public String getAll(){
        List<GroceryItem> groceryItems = itemRepository.findAll();
        return groceryItems.toString();
    }

    public String insert(GroceryItem groceryItem){
        itemRepository.save(groceryItem);
        return "Item inserted";
    }

    public String update(GroceryItem groceryItem){
        itemRepository.save(groceryItem);
        return "Item updated";
    }

    public String delete(String id){
        itemRepository.deleteById(id);
        return "Item deleted";
    }

    public String updateData(String id, GroceryItem groceryItem){
        GroceryItem item = itemRepository.findById(id).get();
        item.setName(groceryItem.getName());
        item.setQuantity(groceryItem.getQuantity());
        item.setCategory(groceryItem.getCategory());
        itemRepository.save(item);
        return "Item updated";
    }

}
