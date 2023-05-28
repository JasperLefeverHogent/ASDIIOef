
package shapebuilder;

import domein.Rectangle;
import java.awt.Color;

public class ShapeBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle r = new Rectangle.Builder().height(250).width(300).opacity(0.5).color(Color.PINK).build();
    }
}
