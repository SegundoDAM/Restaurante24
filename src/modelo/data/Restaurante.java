package modelo.data;

import java.util.List;

public class Restaurante implements IEstablecimento{
	private long id;
	private List<Mesa> mesas;
	
	public Restaurante(long id) {
		super();
		this.id = id;
		this.mesas = conseguirMesas();
	}

	private List<Mesa> conseguirMesas() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setMesas(List<Mesa> mesas) {
		this.mesas = mesas;
	}
	
	
	
}
