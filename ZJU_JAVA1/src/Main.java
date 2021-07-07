import java.util.Scanner;

//import fraction.Fraction;

public class Main {



	public static void main(String[] args) {
		System.out.println("Input:");

		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());

		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();

	}

}

class Fraction {
	private int denominator=1;
	private int numerator=1;
	
	public Fraction(int nume, int denom) {
		this.numerator = nume;
		this.denominator = denom;
	}
	
    double toDouble() {
    	double res = (double)(this.numerator/this.denominator);
    	return res;
    }
    
    public Fraction plus(Fraction r) {
    	int denom_ = this.denominator * r.denominator;
    	int nume_ = this.numerator*r.denominator + this.denominator*r.numerator;
    	return new Fraction(nume_,denom_);
    }

	public Fraction multiply(Fraction r) {
    	int nume_ = this.numerator * r.numerator;
		int denom_ = this.denominator * r.denominator;
		return new Fraction(nume_, denom_);
    }
    public void print() {
    	if (this.numerator == this.denominator) {
    		System.out.println('1');
    	} else {
    		int a = 0;
    		int b = 0;
    		boolean reverse = false;
    		if (this.numerator < this.denominator) {
    			a = this.numerator;
    			b = this.denominator;
    		} else {
    			a = this.denominator;
    			b = this.numerator;
    			reverse = true;
    		}
    		for (int i=2;i<=Math.abs(a);i++) {
    			if(a%i==0 && b%i==0) {
    				a = a/i;
    				b = b/i;
    			}
    		}
    		if (reverse!=true) {
    			System.out.printf("%d/%d\n",a,b);
    		}else {    			
    			System.out.printf("%d/%d\n",b,a);
    		}
    	}
    }

}
