package gradle.cucumber;

public class SaltarOlanzarBombas extends Poder {

    @Override
    public void moverPersonaje(Juego juego, Posicion posicion) {
        new SaltarTodoTipoDePared().moverPersonaje(juego, posicion);
    }

    @Override
    public Posicion posicionParaLaBomba(Posicion posicion, Direccion direccion){ return new LanzarBomba().posicionParaLaBomba(posicion, direccion); }

}
