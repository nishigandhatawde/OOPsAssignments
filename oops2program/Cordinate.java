package com.oops2program;

public class Cordinate {
	private int X;
    private int Y;

    public Cordinate() {
        this(0,0);
    }        
    public Cordinate(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }
    public int getX() {
        return X;
    }
    public int getY() {
        return Y;
    }
    public void setX(int X) {
        this.X = X;
    }
    public void setY(int Y) {
        this.Y = Y;
    }

}
