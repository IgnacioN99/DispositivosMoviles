package dispositivos.prog3.info;

public class Tablet extends Mobile {
	private int pulgadas;
	
	public Tablet(String Marca,String SO,String modelo,int costo,int pulgadas) {
		super(Marca, SO, modelo, costo);
		this.pulgadas=pulgadas;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}
	@Override
	public boolean equals(Object obj) {
		if(!super.equals(obj)) {
			return false;
		}
		Tablet t= (Tablet) obj;
		if(!(t.getPulgadas()==this.getPulgadas())) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return super.toString()+
				"\nPulgadas: "+this.getPulgadas();
	}
}
