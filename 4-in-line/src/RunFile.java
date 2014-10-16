
public class RunFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Begin.printMenuPrincipal();
		int tipoPartida = Begin.leerTeclado(1, 2);
		Game game = new Game(tipoPartida);
		game.iniciarJuego();
	}

}
