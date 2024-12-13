package scc.br.CepService.java;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "viaCep", url = "https://viacep.com.br/ws/")
public interface ViaCepClient {

    @GetMapping("/{cep}/json/")
    String getCidade(@RequestParam("cep") String cep);
}
