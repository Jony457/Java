
public class Player {

	private char ficha;
	private boolean turno;
	private String nombre;
	Player(char ficha, String nombre)
	{
		this.ficha = ficha;
		this.nombre = nombre;
	}
	public void setTurno(boolean turno)
	{
		this.turno = turno;
	}
	public boolean tieneElTurno()
	{
		return turno;
	}
	public int pensarJugada(Table table)
	{
		Begin.printTurno(nombre, ficha);
		return Begin.leerTeclado(1, 7);
	}
	public char getFicha() {
		
		return ficha;
	}
	public String getNombre(){
		return nombre;
	}
	
}
