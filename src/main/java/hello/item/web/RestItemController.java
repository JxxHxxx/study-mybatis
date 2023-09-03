package hello.item.web;

import hello.item.domain.Item;
import hello.item.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class RestItemController {

    private final ItemService itemService;

    @GetMapping("/items/{item-id}")
    public ResponseEntity<Item> findItem(@PathVariable("item-id") Long itemId) {
        Optional<Item> optionalItem = itemService.findById(itemId);
        Item item = optionalItem.get();

        return ResponseEntity.ok(item);
    }
}
