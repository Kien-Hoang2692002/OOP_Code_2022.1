package java_46;

public class PhanMemMayTinh implements MayTinhBoTuiInterface,SapXepInterface{

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
	
	@Override
	public void sapXepTang(double[] arr) {
		int n = arr.length;
		double key;
		int i, j;
		for (i = 1; i < n; i++) 
		{
			key = arr[i];
			j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		
	}

	@Override
	public void sapXepGiam(double[] arr) {
		int n = arr.length;
		double key;
		int i, j;
		for (i = 1; i < n; i++) 
		{
			key = arr[i];
			j = i - 1;

			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		
	}
	
}
