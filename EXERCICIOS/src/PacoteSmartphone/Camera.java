package PacoteSmartphone;

public class Camera {
    private String resolucao; //MP

    public Camera() {
        this.resolucao = "12MP";
    }

    public Camera(String resolucao) {
        this.resolucao = resolucao;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }
}
