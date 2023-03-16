package P04InterfacesAndAbstraction.P02CarShopExtended;

public interface Rentable extends Car {
    Integer getMinRentPerDay();
    Double getPricePerDay();
}
