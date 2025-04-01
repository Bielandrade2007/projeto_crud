package br.com.anm.produto.crud_produto.servico;
    
import org.aspectj.weaver.patterns.HasThisTypePatternTriedToSneakInSomeGenericOrParameterizedTypePatternMatchingStuffAnywhereVisitor;
import org.mockito.internal.matchers.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.client.HttpMessageConvertersRestClientCustomizer;
import org.springframework.stereotype.Service;

@Service 
 public class ProdutoServico {

    @Autowired
    private ProdutoRepositorio pr;

    @Autowired
    private RespostaModelo rm;    

    public Iterable<ProdutoModelo> listar(){
        return pr.findAll();
            
        }
        //cadrastrar produto 
        public ResponseEntity<?> cadrastrar (ProdutoModelo pm){
            if(pm.getNome().equals("") ){
                rm.setResposta(resposta:"O nome do produto é obrigatório!");
                return new ResponseEntity<RespostaModelo>(rm,HttpStatus.BAD_REQUEST);
            }else if(pm.getMarca().equals("")){
                rm.setResposta(resposta:"O nome da marca do produto é obrigatório!");
                return new ResponseEntity<RespostaModelo>(rm,HttpStatus.BAD_REQUEST);
            }else{
                return new ResponseEntity<ProdutoModelo>(pr.save(pm),HttpStatuS.CREATED);

            }
        }

    }
