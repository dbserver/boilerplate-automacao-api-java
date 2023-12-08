package bergs.Cap.Capuaajm.main.java.framework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import bergs.Cap.Capuaajm.main.java.framework.utils.FileOperations;
import bergs.Cap.Capuaajm.main.java.framework.utils.simplereportbuilder.ReportBuilder;

public class TestBase {
    private static final String UrlApiAlvo = FileOperations
            .getPropertiesTestes("api_config")
            .getProperty("url");

    @BeforeEach
    public void setup() {

    }

    @AfterEach
    public void finalizar() {
        ReportBuilder.concluir();
    }
}
