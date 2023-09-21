package java_46;

public class MayTinhCasioFX500 implements MayTinhBoTuiInterface {

	@Override
	public double cong(double a, double b) {
		return a+b;
	}

	@Override
	public double tru(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double nhan(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double chia(double a, double b) {
		try {
			b = 0;
			return a/b ;
		} catch (Exception e) {
			System.out.println("Loi /0 !");
		}
		return a/b;
		
	}
	
}
