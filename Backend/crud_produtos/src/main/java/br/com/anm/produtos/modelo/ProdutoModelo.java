package br.com.anm.produtos.modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "produtos")
public class ProdutoModelo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long code;
  private String nome;
  private String marca;
}