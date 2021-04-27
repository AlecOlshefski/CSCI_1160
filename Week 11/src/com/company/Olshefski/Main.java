package com.company.Olshefski;

abstract class Rectangle{

    //Abstract Methods
    abstract public double getWidth();
    abstract public double getHeight();

    //Static member class nested, no instance necessary
    static class DoubleRectagle extends Rectangle{

        private double width, height;

        //Constructor
        public DoubleRectagle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        //Getter and setter
        public void setWidth(double width) {
            this.width = width;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        //Override the abstract methods in Rectangle
        @Override
        public double getWidth() {
            return width;
        }

        @Override
        public double getHeight() {
            return height;
        }
    }

    //Static member class, no instance necessary
    static class FloatRectangle extends Rectangle{
        private float width,height;

        //Constructor
        public FloatRectangle(float width, float height) {
            this.width = width;
            this.height = height;
        }

        //getter and setter
        public void setWidth(float width) {
            this.width = width;
        }

        public void setHeight(float height) {
            this.height = height;
        }

        //Override the abstract method in rectangle
        @Override
        public double getWidth() {
            return width;
        }

        @Override
        public double getHeight() {
            return height;
        }
    }

    private Rectangle(){
    }

    double getArea(){
        return (getHeight()*getWidth());
    }

}


class Square extends Rectangle{
    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public double getHeight() {
        return 0;
    }

}

public class Main {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle.DoubleRectagle(10.0,20.0);
        Rectangle r2 = new Rectangle.FloatRectangle(5.0f,8.0f);
        System.out.println("Area of first rectangle " + r1.getArea());
        System.out.println("Area of second rectangle " + r2.getArea());

    }
}
