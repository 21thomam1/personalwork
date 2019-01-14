package inheritance;

public class Quadrilateral {
	private double s1;
	private double s2;
	private double s3;
	private double s4;

	public Quadrilateral() {
		s1 = 1;
		s2 = 1;
		s3 = 1;
		s4 = 1;
	}

	public Quadrilateral(double xs1, double xs2, double xs3, double xs4) {
		s1 = xs1;
		s2 = xs2;
		s3 = xs3;
		s4 = xs4;
	}

	public double getside1() {
		return s1;
	}

	public double getside2() {
		return s2;
	}

	public double getside3() {
		return s3;
	}

	public double getside4() {
		return s4;
	}

	public void setside1(double xs1) {
		s1 = xs1;
	}

	public void setside2(double xs2) {
		s1 = xs2;
	}

	public void setside3(double xs3) {
		s1 = xs3;
	}

	public void setside4(double xs4) {
		s1 = xs4;
	}

	public double perimeter() {
		return s1 + s2 + s3 + s4;
	}

	public String toString() {
		return "Quadrilateral object side1: " + s1 + " side2: " + s2 + " side3: " + s3 + " side4: " + s4;
	}

	public boolean equals(Quadrilateral otherQuad) {
		return this.toString().equals(otherQuad.toString());
	}

	public Object clone() {
		return new Quadrilateral(s1, s2, s3, s4);
	}
}
