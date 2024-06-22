package oop;

public  class ComplexNumber {

    private double re;

    private double im;

    public ComplexNumber() {

    }

    public ComplexNumber(double re, double im) {

        this.re = re;

        this.im = im;

    }

    public double getRe() {

        return re;

    }

    public double getIm() {

        return im;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (obj == null || getClass() != obj.getClass()) return false;

        ComplexNumber other = (ComplexNumber) obj;

        return Double.compare(re, other.re) == 0 && Double.compare(im, other.im) == 0;
    }

    @Override
    public int hashCode() {

        int result = Double.hashCode(im);
        result = (31* result + Double.hashCode(re));
        return result;

    }
}
