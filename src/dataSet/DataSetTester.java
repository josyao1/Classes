package dataSet;

public class DataSetTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataSet d1 = new DataSet(6);
		DataSet d2 = new DataSet();
		d1.addValue(5);
		d2.addValue(7);
		System.out.println(d1.getSum());
		System.out.println(d2.getSum());
		System.out.println(d1.getAverage());
		System.out.println(d2.getAverage());
		String s = "tomato";
		int k = s.indexOf("m");
		System.out.println(k);
		System.out.println(s.substring(k+1,s.length()));


		
	}

}
