package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConfigSistemaTest {

    @Test
    public void deveRetornarNomeSistema() {
        ConfigSistema.getInstance().setNomeSistema("Sistema Acadêmico");
        assertEquals("Sistema Acadêmico", ConfigSistema.getInstance().getNomeSistema());
    }

    @Test
    public void deveRetornarVersaoSistema() {
        ConfigSistema.getInstance().setVersaoSistema("1.0");
        assertEquals("1.0", ConfigSistema.getInstance().getVersaoSistema());
    }

}