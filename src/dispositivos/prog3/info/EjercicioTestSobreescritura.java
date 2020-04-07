package dispositivos.prog3.info;

public class EjercicioTestSobreescritura {

	public static void main(String[] args) {
		SmartPhone s1=new SmartPhone("Samsung","Android","S3",20000,1161766801);
		SmartPhone s2=new SmartPhone("Mototrola","WindowsPhone","Razr",200000,1161766801);
		System.out.println(s1.equals(s2));
		System.out.println(s1.toString()+"\n\n\n"+s2.toString());
	}
}
