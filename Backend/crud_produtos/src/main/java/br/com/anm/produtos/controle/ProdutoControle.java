package br.com.anm.produto.crud_produtos.controler;

import org.springtramework.web.bind.annotation.GetMapping;

import org.springtramework.web.bind.annotation.RestControler;

@RestController
public class ProdutoControle {
    @GetMapping("/")
    public String rota(){
        return"A API está funcionando";
        }
}
