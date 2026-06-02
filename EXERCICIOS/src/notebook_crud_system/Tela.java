package notebook_crud_system;

public class Tela {
    private String tipoPainel; // IPS, OLED, TN
    private int taxaAtualizacaoHz; // 60, 144, 240
    private int brilhoNits; // 250, 400

    public Tela(String tipoPainel, int taxaAtualizacaoHz, int brilhoNits) {
        this.tipoPainel = tipoPainel;
        this.taxaAtualizacaoHz = taxaAtualizacaoHz;
        this.brilhoNits = brilhoNits;
    }

    @Override
    public String toString() {
        return tipoPainel + " (" + taxaAtualizacaoHz + "Hz / " + brilhoNits + " nits)";
    }

    // Getters e Setters
    public String getTipoPainel() { return tipoPainel; }
    public void setTipoPainel(String tipoPainel) { this.tipoPainel = tipoPainel; }

    public int getTaxaAtualizacaoHz() { return taxaAtualizacaoHz; }
    public void setTaxaAtualizacaoHz(int taxaAtualizacaoHz) { this.taxaAtualizacaoHz = taxaAtualizacaoHz; }

    public int getBrilhoNits() { return brilhoNits; }
    public void setBrilhoNits(int brilhoNits) { this.brilhoNits = brilhoNits; }
}