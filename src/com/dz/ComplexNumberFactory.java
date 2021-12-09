package com.dz;

public class ComplexNumberFactory implements CompexNumber{
    String number, im;
    int re;

    public ComplexNumberFactory(int x, int y) {
        setNumber(x, y);
    }

    @Override
    public ReFactory createRe() {
        return new ReFactory();
    }

    @Override
    public ImFactory createIm() {
        return new ImFactory();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(int x, int y) {
        this.im=createIm().getIm(y);
        this.re=createRe().getRe(x);
        this.number=this.re+"+"+this.im;
    }
}
