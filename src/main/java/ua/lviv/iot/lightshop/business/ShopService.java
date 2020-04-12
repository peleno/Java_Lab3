package ua.lviv.iot.lightshop.business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.lightshop.dataaccess.ShopRepository;
import ua.lviv.iot.lightshop.model.Shop;

@Service
public class ShopService {

    @Autowired
    private ShopRepository shopRepository;

    public List<Shop> getAllShops() {
        return shopRepository.findAll();
    }

    public Shop getShopById(Integer shopId) {
        return shopRepository.findById(shopId).get();
    }

    public Shop createShop(Shop shop) {
        return shopRepository.save(shop);
    }

    public Shop updateShop(Integer shopId, Shop shop) {
        shop.setId(shopId);
        return shopRepository.save(shop);
    }

    public void deleteShop(Integer shopId) {
        shopRepository.deleteById(shopId);
    }

    public boolean shopExists(Integer shopId) {
        return shopRepository.existsById(shopId);
    }
}
