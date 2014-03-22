package mental.Core.Elements;

import mental.Interfaces.IElement;

import java.awt.*;

/**
 * Created by TOSHIBA on 21/03/14.
 */
public class ImageElement extends Element {
    private Image image;

    @Override
    public FieldEnum getFieldType() {
        return FieldEnum.image;
    }

    @Override
    public Object getValue() {
        return image;
    }

    @Override
    public CompareEnum compareTo(Object iValue) {
        return CompareEnum.invalidComparison;
    }
}
