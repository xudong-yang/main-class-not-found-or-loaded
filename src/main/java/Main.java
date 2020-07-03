import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;

public class Main {

    public static final int PORT = 8002;
    public static final String MOCK_DIR = "src/main/resources/mock";

    public static void main(String[] args) {
        final WireMockConfiguration configuration = WireMockConfiguration.wireMockConfig()
                .port(PORT)
                .usingFilesUnderDirectory(MOCK_DIR);
        final WireMockServer server = new WireMockServer(configuration);
        server.start();
    }
}
