package gradle.cucumber;

public class ContenidoVacio extends Contenido {
    @Override
    public boolean esVacio() {
        return true;
    }

    @Override
    public void interactuarCon(Bomberman bomberman, Celda celda){
        bomberman.basicMover(celda);
    }
}
