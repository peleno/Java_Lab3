package ua.lviv.iot.lightshop.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.lightshop.business.ShopService;
import ua.lviv.iot.lightshop.model.Shop;

@RestController
@RequestMapping(path = "/shops")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @GetMapping
    public List<Shop> getAllShops() {
        return shopService.getAllShops();
    }

    @GetMapping(path = "/{id}")
    public Shop getShopById(Integer shopId) {
        return shopService.getShopById(shopId);
    }

    @PostMapping
    public Shop createShop(final @RequestBody Shop shop) {
        return shopService.createShop(shop);
    }

    @PutMapping
    public ResponseEntity<Shop> updateShop(final @PathVariable("id") Integer shopId, final @RequestBody Shop shop) {
        Shop previousShop = shopService.getShopById(shopId);
        shop.setId(shopId);
        if (previousShop != null) {
            shopService.updateShop(shopId, shop);
            return ResponseEntity.ok(previousShop);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping
    public ResponseEntity<Shop> deleteShop(final @PathVariable("id") Integer shopId) {
        if (shopService.shopExists(shopId)) {
            shopService.deleteShop(shopId);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
