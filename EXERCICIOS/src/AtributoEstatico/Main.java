package AtributoEstatico;

public class Main {

    public static void main(String[] args) {
        PortalInterdimensional p1 = new PortalInterdimensional("Terra-2");
        PortalInterdimensional p2 = new PortalInterdimensional("Planeta dos Macacos", true);

        p1.ativarPortal();        
        p2.desativaPortal();

        PortalInterdimensional.mostrarTotalPortais();
    }
}