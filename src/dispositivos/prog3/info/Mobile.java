package dispositivos.prog3.info;


public abstract class Mobile {
		private String Marca,SO,modelo;
		private double costo;
		public Mobile(String Marca,String SO,String modelo,double costo) {
			this.Marca=Marca;
			this.SO=SO;
			this.modelo=modelo;
			this.costo=costo;
		}
		public String getMarca() {
			return Marca;
		}
		public void setMarca(String marca) {
			Marca = marca;
		}
		public String getSO() {
			return SO;
		}
		public void setSO(String sO) {
			SO = sO;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public double getCosto() {
			return costo;
		}
		public void setCosto(double costo) {
			this.costo = costo;
		}
		@Override
		public String toString() {
			return "Tablet de marca: "+getMarca()+ 
					"\nS.O.: "+getSO()+
					"\nModelo: "+getModelo()
					+"\nCosto $"+getCosto();
		}
		@Override
		public boolean equals(Object obj) {
			Mobile movil  = (Mobile) obj;
			if(!movil.getMarca().equals(this.getMarca())) {
				return false;
			}
			if(!(movil.getCosto()==this.getCosto())) {
				return false;
			}
			if(!(movil.getModelo().equals(this.getModelo()))) {
				return false;
			}
			if (!(movil.getSO().equals(this.getSO()))) {
				return false;
			}
			return true;
		}
		
		
}
