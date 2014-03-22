package mental.Core.Elements;

import mental.Interfaces.IElement;

/**
 * Created by TOSHIBA on 21/03/14.
 */
public class NumericElement extends Element {
    Float value;

    public NumericElement(Float value) {
        this.value = value;
    }

    @Override
    public FieldEnum getFieldType() {
        return FieldEnum.numeric;
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public CompareEnum compareTo(Object iValue) {
        if(!(iValue instanceof Float))
            return CompareEnum.invalidComparison;

        Float num = (Float)iValue;
        float g = value.floatValue();
        float f = num.floatValue();

        if(g == f) return CompareEnum.equalTo;
        if(g > f) return CompareEnum.greaterThan;
        return CompareEnum.lessThan;
    }
}
