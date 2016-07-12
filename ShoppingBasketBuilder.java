package com.codurance.craftingcode.exercise_10_shopping_cart;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ShoppingBasketBuilder {

    private LocalDate creationDate = LocalDate.now();
    private UserID userID = new UserID("SOME ID");
    private List<ShoppingBasketItem> items = new ArrayList<>();

    public static ShoppingBasketBuilder aShoppingBasket() {
        return new ShoppingBasketBuilder();
    }

    public ShoppingBasketBuilder createdOn(LocalDate creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    public ShoppingBasketBuilder ownedBy(UserID userID) {
        this.userID = userID;
        return this;
    }

    public ShoppingBasketBuilder withItem(ProductID productID, int quantity) {
        this.items.add(new ShoppingBasketItem(productID, quantity));
        return this;
    }

    public ShoppingBasket build() {
        ShoppingBasket shoppingBasket = new ShoppingBasket(userID, creationDate);
        items.forEach(item -> shoppingBasket.add(item));
        return shoppingBasket;
    }
}
