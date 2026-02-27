public class Carro {

    private String nome;
    private String marca;
    private String cor;
    private int velocidade;
    private int marcha;

    // Construtor completo
    public Carro(String nome, String cor, String marca, int velocidade, int marcha) {
        this.nome = nome;
        this.cor = cor;
        this.marca = marca;
        this.velocidade = velocidade;
        this.marcha = marcha;
    }

    // Construtor padrão
    public Carro() {
        this.velocidade = 0;
        this.marcha = 1;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    
    // Métodos do carro
    public void acelerar() {
        this.velocidade += 10;

        // Troca automática de marcha
        if (velocidade <= 20) {
            marcha = 1;
        } else if (velocidade <= 40) {
            marcha = 2;
        } else if (velocidade <= 60) {
            marcha = 3;
        } else if (velocidade <= 80) {
            marcha = 4;
        } else {
            marcha = 5;
        }

        System.out.println(nome + " acelerou!");
    }
    
    public void frear() {
        if (velocidade > 0) {
            velocidade -= 10;

            if (velocidade < 0) {
                velocidade = 0;
            }

            if (velocidade <= 20) {
                marcha = 1;
            } else if (velocidade <= 40) {
                marcha = 2;
            } else if (velocidade <= 60) {
                marcha = 3;
            } else if (velocidade <= 80) {
                marcha = 4;
            } else {
                marcha = 5;
            }

            System.out.println(nome + " freou!");
        } else {
            System.out.println(nome + " já está parado!");
        }
    }

    public void aumentarMarcha() {
        if (this.marcha < 5) {
            this.marcha++;
            System.out.println(nome + " aumentou a marcha! Marcha atual: " + marcha);
        } else {
            System.out.println(nome + " já está na marcha máxima!");
        }
    }

    public void diminuirMarcha() {
        if (this.marcha > 1) {
            this.marcha--;
            System.out.println(nome + " reduziu a marcha! Marcha atual: " + marcha);
        } else {
            System.out.println(nome + " já está na menor marcha!");
        }
    }   
    
    
    

    public void estadoAtual() {
        System.out.println("Carro: " + this.nome);
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Velocidade: " + this.velocidade + " km/h");
        System.out.println("Marcha: " + this.marcha);
    }
}