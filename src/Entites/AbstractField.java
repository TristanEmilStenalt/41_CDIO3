package Entites;

public abstract class AbstractField {

    protected String fieldName;
    protected int fieldID;

    public AbstractField(String fieldName, boolean fieldOwned, int fieldID) {
        this.fieldName = fieldName;
        this.fieldID = fieldID;
    }

    // get&set Methods
    public String getFieldName() {
        return fieldName;
    }


    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }


    public int getFieldID() {
        return fieldID;
    }


    public void setFieldID(int fieldID) {
        this.fieldID = fieldID;
    }




    // Functional methods
    public void fieldEffect()
    {

    }


    public void fieldOwnedEffect()
    {

    }




}
