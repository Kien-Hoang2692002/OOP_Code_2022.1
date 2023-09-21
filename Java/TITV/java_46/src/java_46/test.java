package java_46;

public class test {
	public static void main(String[] args) {
		System.out.println("test cau a: ");
		
		MayTinhCasioFX500 mfx500 = new MayTinhCasioFX500();
		MayTinhVinaCal500 mvn500 = new MayTinhVinaCal500();
		
		System.out.println(mfx500.cong(5,3));
		System.out.println(mfx500.chia(5,0));
		
		System.out.println(mvn500.cong(5,3));
		System.out.println(mvn500.chia(5,0));
		
		System.out.println("test cau b");
		double arr[] = new double[] {5,1,3,4,-1,0,5,8};
		double arr2[] = new double[] {6,2,3,5,4,5};
		SapXepChen sxchen = new SapXepChen();
		SapXepChon sxchon = new SapXepChon();
		
		sxchen.sapXepTang(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		sxchon.sapXepGiam(arr2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		PhanMemMayTinh pmmt = new PhanMemMayTinh();
		
		System.out.println(pmmt.cong(10,3));
		
	}
}
