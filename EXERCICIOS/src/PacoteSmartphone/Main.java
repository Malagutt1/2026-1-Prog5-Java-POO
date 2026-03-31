package PacoteSmartphone;

/*
 * 3. Utilizando as classes Ram, Processador, Tela, Bateria e Câmera desenvolvidas, 
 * crie uma classe Smartphone que seja composta por tais elementos. 
 * Os atributos desta classe são private. Desenvolva 
 * os métodos set, get e um outro que imprima na tela todas as características do smartphone. 
 * O nome do projeto é “ProjetoSmartphone” e do pacote é “PacoteSmartphone”. 
 * No main, instancie um iphone 13 e um Samsung S21. Para tal, procure a ficha técnica de tais equipamentos.
*/

public class Main {
    public static void main(String[] args) {
    	//Iphone
        Ram ramIphone = new Ram("DDR4", 4);
        Processador procIphone = new Processador("Apple", "A15 Bionic", 3.23);
        Tela telaIphone = new Tela(6.1, "1170x2532");
        Bateria bateriaIphone = new Bateria(3240);
        Camera cameraIphone = new Camera("12MP + 12MP");
        Smartphone iphone13 = new Smartphone("iPhone 13", ramIphone, procIphone, telaIphone,bateriaIphone, cameraIphone);

        //Samsung
        Ram ramS21 = new Ram("DDR5", 8);
        Processador procS21 = new Processador("Samsung/Qualcomm", "Exynos 2100 / Snapdragon 888", 2.84);
        Tela telaS21 = new Tela(6.2, "1080x2400");
        Bateria bateriaS21 = new Bateria(4000);
        Camera cameraS21 = new Camera("12MP + 64MP + 12MP");
        Smartphone galaxyS21 = new Smartphone("Samsung Galaxy S21", ramS21, procS21, telaS21, bateriaS21, cameraS21);
        
        //Console
        iphone13.imprimirDados();
        galaxyS21.imprimirDados();
    }
}
