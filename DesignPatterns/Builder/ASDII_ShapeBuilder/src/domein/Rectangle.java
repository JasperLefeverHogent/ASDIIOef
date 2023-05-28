package domein;

import java.awt.Color;

public class Rectangle {
    private final double opacity;
    private final double height;
    private final double width;
   // ...
    private final Color color;


    public static class Builder {
        private double opacity;
        private double height;
        private double width;
        private Color color;
        // ...

        public Builder opacity(double opacity) {
            this.opacity = opacity;
            return this;
        }

        public Builder height(double height) {
            this.height = height;
            return this;
        }
        public Builder width(double width) {
           this.width = width;
           return this;
        }
        public Builder color(Color color) {
            this.color = color;
            return this;
        }
       // ...

        public Rectangle build() {
            return new Rectangle(this);
        }



    }

    private Rectangle(Builder builder) {
        this.opacity = builder.opacity;
        this.height = builder.height;
        this.width = builder.width;
        this.color = builder.color;
        //...
        //Hier validatie code...
    }

}