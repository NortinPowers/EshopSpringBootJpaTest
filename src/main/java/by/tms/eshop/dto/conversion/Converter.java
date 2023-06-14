//package by.tms.eshop.dto.conversion;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Component;
//
//@Component
//@RequiredArgsConstructor
//public class Converter {
//
////    private final ProductMapper productMapper;
//
////    public ProductDto makeProductDtoModelTransfer(Product product) {
////        return ProductDto.builder()
////                .id(product.getId())
////                .price(product.getPrice())
////                .info(product.getInfo())
////                .name(product.getName())
////                .category(product.getProductCategory().getCategory())
////                .build();
////    }
//
////    public Product makeProductModelTransfer(ProductDto productDto) {
////        return Product.builder()
////                .id(productDto.getId())
////                .price(productDto.getPrice())
////                .info(productDto.getInfo())
////                .name(productDto.getName())
////                .productCategory(ProductCategory.builder()
////                        .category(productDto.getCategory())
////                        .build())
////                .build();
////    }
//
////    public UserDto makeUserDtoModelTransfer(User user) {
////        return UserDto.builder()
////                .id(user.getId())
////                .login(user.getLogin())
////                .name(user.getName())
////                .surname(user.getSurname())
////                .email(user.getEmail())
////                .birthday(user.getBirthday())
////                .build();
////    }
//
////    +
////    public User makeUserModelTransfer(UserFormDto user) {
////        return User.builder()
////                .id(user.getId())
////                .login(user.getLogin())
////                .password(user.getPassword())
////                .name(user.getName())
////                .surname(user.getSurname())
////                .email(user.getEmail())
////                .birthday(user.getBirthday())
////                .build();
////    }
//
////    public List<Product> getProductsFromProductsDtos(List<ProductDto> productsDto) {
////        return productsDto.stream()
////                .map(productMapper::convertToProduct)
//////                .map(this::makeProductModelTransfer)
////                .toList();
////    }
//
////    public LocationDto selectCart() {
////        return LocationDto.builder()
////                .cart(true)
////                .favorite(false)
////                .build();
////    }
////
////    public LocationDto selectFavorite() {
////        return LocationDto.builder()
////                .cart(false)
////                .favorite(true)
////                .build();
////    }
//
////    public OrderDto makeOrderDtoModelTransfer(Order order) {
////        return OrderDto.builder()
////                .id(order.getId())
////                .name(order.getName())
////                .date(order.getDate())
////                .user(order.getUser())
////                .products(order.getProducts())
////                .build();
////    }
//
////    public List<OrderDto> getOrdersDtosFromOrders(List<Order> orders) {
////        return orders.stream()
////                .map(this::makeOrderDtoModelTransfer)
////                .collect(Collectors.toList());
////    }
//}
