package spring.PegarDadosApplication.StarterGetDados;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {
    @Autowired
    spring.PegarDadosApplication.model.user user;

    public void getConta(){
        System.out.println("Nome: " + user.getNome()
        + "\nConta: " + user.getConta());
    }
    public void getContatos(){
        System.out.print("Telefone: " + user.getTelefone()
        + "\nEmail: " + user.getEmail());
    }

    public void run(String...args) throws Exception{
        getConta();
        getContatos();
    }
}
