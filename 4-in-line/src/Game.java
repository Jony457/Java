
public class Game {
	
	int modo;
	String estado;
	Player player1;
	Player player2;
	Table table;
	
	Game(int modo)
	{
		player1 = new Player('X',"Jugador1");
		this.modo = modo;	
		table = new Table(6,7);
		configurarJuego();	
	}

	public void configurarJuego()
	{
			player2 = new Player('@',"Jugador2");
	}

	public void iniciarJuego() {

		player1.setTurno(true);
		while(!terminaElJuego())
		{
			Begin.imprimeTablero(table.getFormaDeImpresion());
			if(player1.tieneElTurno())
			    lanzaJugador1();
			else
				lanzaJugador2();
			Begin.imprimeTablero(table.getFormaDeImpresion());
		}
		
		
	}
	
	private void lanzaJugador2() {
		int columna = player2.pensarJugada(table);
		if(table.setFicha(columna, player2.getFicha()))
		{
			player2.setTurno(false);
			player1.setTurno(true);
		}
		
	}

	private void lanzaJugador1() {
		int columna = player1.pensarJugada(table);
		if(table.setFicha(columna, player1.getFicha()))
		{
			player1.setTurno(false);
			player2.setTurno(true);
		}
		
	}

	private boolean terminaElJuego()
	{	
			
		if(table.isFull())
		{
			Begin.printResultados("Nichya");
			return true;
		}			
		if(table.existenFichasContiguas(4, player1.getFicha()))
		{
			Begin.printResultados(player1.getNombre());
			return true;
		}
		if(table.existenFichasContiguas(4, player2.getFicha()))
		{
			Begin.printResultados(player2.getNombre());
			return true;
		}
		return false;
				
	}
	
	
	

}
