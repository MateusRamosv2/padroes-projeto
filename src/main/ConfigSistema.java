package main;

public class ConfigSistema {

    private ConfigSistema() {}

    private static final ConfigSistema instance = new ConfigSistema();

    public static ConfigSistema getInstance() {
        return instance;
    }

    private String nomeSistema;
    private String versaoSistema;

    public String getNomeSistema() {
        return nomeSistema;
    }

    public void setNomeSistema(String nomeSistema) {
        this.nomeSistema = nomeSistema;
    }

    public String getVersaoSistema() {
        return versaoSistema;
    }

    public void setVersaoSistema(String versaoSistema) {
        this.versaoSistema = versaoSistema;
    }
}