package ua.lviv.iot.lightshop.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.lightshop.model.Shop;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Integer> {

}
