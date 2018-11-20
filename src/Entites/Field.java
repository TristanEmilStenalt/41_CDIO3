package Entites;

public class Field
{
    private String fieldName;
    private String Message;
    private int fieldEffect;
    private boolean isSpecialField;
    private boolean isPositiveValue;

    /**
     * Dice is initiated with a Sides Attribute
     *
     * @see fieldName           Name of the field                                   -
     * @see Message             Message the Field displays when you land on it
     * @see fieldEffect         the Value of the effect when you land on a field
     * @see isSpecialField      a boolean to see if you get an extra turn
     * @see isPositiveValue     a boolean to see if the effect value is Positive.
     *
     * @param fieldName           Name of the field                                   -
     * @param Message             Message the Field displays when you land on it
     * @param fieldEffect         the Value of the effect when you land on a field
     * @param isSpecialField      a boolean to see if you get an extra turn
     * @param isPositiveValue     a boolean to see if the effect value is Positive.
     *
     * @return Field
     * @author Hans P Byager , Tristan
     * @date   08.11.2018
     */
    public Field( String name , String Message , int effect, boolean isSpecialField , boolean isPositiveValue ) //field object constructor
    {
        this.fieldName = name;
        this.Message = Message;
        this.fieldEffect = effect;
        this.isSpecialField = isSpecialField;
        this.isPositiveValue = isPositiveValue;
    }

    //perhaps get & set methods if u wanted a field to change over time(goldmine could give less every time landed on etc...)

    //get & set name
    /**
     *getFieldName gets the name attribute of the Field and returns it
     *
     * @return String name
     * @author Tristan
     * @date   08.11.2018
     */
    public String getFieldName()
    {
        return fieldName;
    }
    /**
     *setFieldName sets the name attribute of the Field
     *
     * @return void
     * @author Tristan
     * @date   08.11.2018
     */
    public void setFieldName(String fieldName)
    {
        this.fieldName = fieldName;
    }

    //get & set fieldMessage
    /**getFieldMessage gets the Message attribute of the Field and returns it
     *
     * @return String Message
     * @author Hans P Byager
     * @date   08.11.2018
     */
    public String getFieldMessage()
    {
        return Message;
    }
    /**
     *setFieldMessage sets the Message attribute of the Field
     *
     * @return void
     * @author Tristan
     * @date   08.11.2018
     */
    public void setFieldMessage(String Message)
    {
        this.Message = Message;
    }

    //get & set effect
    /**getFieldEffect gets the Effect attribute of the Field and returns it
     *
     * @return int Effect
     * @author Hans P Byager
     * @date   08.11.2018
     */
    public int getFieldEffect()
    {
        return fieldEffect;
    }
    /**setFieldEffect sets the Effect attribute of the Field
     *
     * @return void
     * @author Hans P Byager
     * @date   08.11.2018
     */
    public void setFieldEffect(int fieldEffect)
    {
        this.fieldEffect = fieldEffect;
    }

    //get & set IsSpecial Effect
    /**getFieldSpecEffect gets the Effect attribute of the Field and returns it
     *
     * @return boolean FieldSpecEffect
     * @author Hans P Byager
     * @date   08.11.2018
     */
    public boolean getFieldSpecEffect()
    {
        return isSpecialField;
    }
    /**setFieldSpecEffect sets the Effect attribute of the Field
     *
     * @return void
     * @author Hans P Byager
     * @date   08.11.2018
     */
    public void setFieldSpecEffect(boolean isSpecialField)
    {
        this.isSpecialField = isSpecialField;
    }

    //get & set IsPositiveValue
    /**getisPositiveValue gets the isPositiveValue attribute of the Field and returns it
     *
     * @return boolean FieldSpecEffect
     * @author Hans P Byager
     * @date   08.11.2018
     */
    public boolean getisPositiveValue()
    {
        return isPositiveValue;
    }
    /**setisPositiveValuesets the isPositiveValue attribute of the Field
     *
     * @return void
     * @author Hans P Byager
     * @date   08.11.2018
     */
    public void setisPositiveValue(boolean isPositiveValue)
    {
        this.isPositiveValue = isPositiveValue;
    }

}
