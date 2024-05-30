package modelo.data;

public class Cliente {
	private long id;
	private String nombre;
	public Cliente(long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean checkRestaurant(Restaurante restaurante) {
		return false;
	}
	
	public Restaurante createRestaurant() {
		return new Restaurante(5);
	}
}
