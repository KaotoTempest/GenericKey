package mental.Core.Elements;

import mental.Interfaces.IElement;

/**
 * Created by TOSHIBA on 21/03/14.
 */
public class TextElement extends Element {
    String value;

    @Override
    public FieldEnum getFieldType() {
        return FieldEnum.text;
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public CompareEnum compareTo(Object iValue) {
        if(!(iValue instanceof String)) return CompareEnum.invalidComparison;

        String val2 = (String)iValue;

        if(value.equals(val2)) return CompareEnum.equalTo;
        if(value.contains(val2))return CompareEnum.AContainsB;
        if(val2.contains(value))return CompareEnum.BContainsA;

        return CompareEnum.noMatch;
    }
}
