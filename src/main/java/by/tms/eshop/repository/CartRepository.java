package by.tms.eshop.repository;

import by.tms.eshop.domain.Cart;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CartRepository extends JpaRepository<Cart, Long> {
//public interface CartRepository extends JpaRepository<Cart, Long>, CartCustomizedRepository {

//    void addSelectedProduct(Long userId, Long productId, Location location);
//    void addSelectedProduct(Long userId, Long productId, LocationDto locationDto);

    //    void deleteProduct(Long userId, Long productId, Location location);
    @Query("FROM Cart WHERE user.id = :userId AND product.id = :productId AND favorite = true")
    Optional<Cart> getUserFavorite(Long userId, Long productId);

    @Query("FROM Cart WHERE user.id = :userId AND product.id = :productId AND cart = true")
    Optional<Cart> getUserCart(Long userId, Long productId);
//    void deleteProduct(Long userId, Long productId, LocationDto locationDto);

    //    List<ImmutablePair<ProductDto, Integer>> getSelectedProducts(Long userId, Location location);
    @Query("FROM Cart WHERE user.id = :userId AND favorite = true")
//    List<ImmutablePair<Product, Integer>> getFavoriteProducts(Long userId);
    List<Cart> getFavoriteProducts(Long userId);

    @Query("FROM Cart WHERE user.id = :userId AND cart = true order by product.name")
//    List<ImmutablePair<Product, Integer>> getCartProducts(Long userId);
    List<Cart> getCartProducts(Long userId);
//    List<ImmutablePair<ProductDto, Integer>> getSelectedProducts(Long userId, LocationDto locationDto);

//    boolean checkProduct(Long userId, Long productId, Location location);
//    boolean checkProduct(Long userId, Long productId, LocationDto locationDto);

//    Integer getCartProductCount(Long userId, Long productId);

//    @Query("FROM Cart WHERE user.id = :userId AND product.id = :productId AND cart = true")
//    Integer getCartProductCountTest(Long userId, Long productId);
//
//    List<Cart> findCartByUserIdAndProductIdAndCart(Long userId, Long productId, boolean cart);

    void deleteCartByUserIdAndCart(Long userId, Boolean cart);

//    List<ProductDto> getPurchasedProducts(Long userId, Location location);
//    List<ProductDto> getPurchasedProducts(Long userId, LocationDto locationDto);

    @Query("SELECT new map(product.id as productId, COUNT(product.id) as count) FROM Cart WHERE favorite = true GROUP BY product.id ORDER BY COUNT(product.id) DESC LIMIT 3")
//    @Query("SELECT product.id, COUNT(product.id) FROM Cart WHERE favorite = true GROUP BY product.id ORDER BY COUNT(product.id) DESC LIMIT 3")
//    @Query("SELECT product.id FROM Cart WHERE favorite = true GROUP BY product.id ORDER BY COUNT(product.id) DESC LIMIT 3")
//    @Query("SELECT Product FROM Cart WHERE favorite = true GROUP BY product.id ORDER BY COUNT(product.id) DESC LIMIT 3")
//    @Query("SELECT Product, COUNT(product.id) FROM Cart WHERE favorite = true GROUP BY product.id ORDER BY COUNT(product.id) DESC LIMIT 3")
//    List<Map<Product, Long>> getMostFavorite();
//    List<Product> getMostFavorite();
//    List<Long> getMostFavorite();
    List<Map<Long, Long>> getMostFavorite();
//    Map<Product, Long> getMostFavorite();
//    Map<Long, Long> getMostFavorite();
//    Optional<Object[]> getMostFavorite();



//    select product_id
//    from carts
//    where favorite = true
//    group by product_id
//    order by count(product_id) desc
//    limit 3;
}
