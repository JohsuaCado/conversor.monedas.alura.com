import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi extends Variables{
    public Divisa ConsultaApi() {
    String url="https://v6.exchangerate-api.com/v6/69f39da2a10ba3e89b415e8d/pair/"
            +codigo+"/"+moneda;
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .build();
    try {
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        return new Gson().fromJson(response.body(), Divisa.class);
    }catch (Exception e){
        throw new RuntimeException("No se encontro la moneda");
    }

    }
}
