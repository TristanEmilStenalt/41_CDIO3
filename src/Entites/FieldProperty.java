package Entites;

public class FieldProperty extends AbstractField {


    private String propertyPrice;
    private int propertyRent;

    public FieldProperty(String fieldName, boolean fieldOwned, int fieldID, String propertyPrice, int propertyRent) {
        super(fieldName, fieldOwned, fieldID);
        this.propertyPrice = propertyPrice;
        this.propertyRent = propertyRent;
    }

    // get & set methods
    public String getPropertyPrice() {
        return propertyPrice;
    }

    public void setPropertyPrice(String propertyPrice) {
        this.propertyPrice = propertyPrice;
    }

    public int getPropertyRent() {
        return propertyRent;
    }

    public void setPropertyRent(int propertyRent) {
        this.propertyRent = propertyRent;
    }



    // Functional methods
    @Override
    public void fieldEffect() {
        super.fieldEffect();
    }

    @Override
    public void fieldOwnedEffect() {
        super.fieldOwnedEffect();
    }
}
