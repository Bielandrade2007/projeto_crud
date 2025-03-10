package br.com.anm.produto.crud_produto.servico;
    
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@service 
 public class ProdutoServico {

    @Autowired
    ProdutoRepositorio pr;

    public Iterable<ProdutoModelo> listar(){
        return pr.findAll();
            
        }


    }
