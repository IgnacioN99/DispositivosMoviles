package dispositivos.prog3.info;

public class SmartPhone extends Mobile {
	private int numero;
	public SmartPhone(String Marca,String SO,String modelo,int costo,int numero) {
		super(Marca,SO,modelo,costo);
		this.numero=numero;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public boolean equals(Object obj) {
		if(!super.equals(obj)) {
			return false;
		}
		SmartPhone s= (SmartPhone) obj;
		if(!(s.getNumero()==this.getNumero())) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return super.toString()+
				"\nNumero: "+this.getNumero();
	}
	
}
