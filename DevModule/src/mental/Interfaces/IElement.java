package mental.Interfaces;

/**
 * Created by TOSHIBA on 21/03/14.
 */
public interface IElement {
    enum FieldEnum {
        text,
        numeric,
        image
    }

    enum CompareEnum{
        invalidComparison,
        greaterThan,
        lessThan,
        equalTo,
        noMatch,
        AContainsB,
        BContainsA
    }

    public FieldEnum getFieldType();

    public Object getValue();

    public CompareEnum compareTo(Object iValue);
}
