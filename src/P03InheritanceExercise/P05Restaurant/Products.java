package P03InheritanceExercise.P05Restaurant;

import java.math.BigDecimal;

public class Products {
    private String name;
    private BigDecimal price;

    public Products(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
