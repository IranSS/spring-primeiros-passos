package spring.PegarDadosApplication.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "usuario")
public class user {

    private String nome;
    private String conta;
    private String email;
    private List<Long> telefones;

    public String getNome() {
        return nome;
    }

    public String getConta() {
        return conta;
    }

    public String getEmail() {
        return email;
    }

    public List<Long> getTelefone() {
        return telefones;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefones(List<Long> telefones) {
        this.telefones = telefones;
    }
}
