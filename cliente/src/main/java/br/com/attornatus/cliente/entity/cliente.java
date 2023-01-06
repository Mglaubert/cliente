package br.com.attornatus.cliente.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Cliente implements Serializable{
    
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @Column(name = "nome", nullable = false)
        rivate String nome;

        @Column(name="data_nasc")
        private String data_nasc;

        @Column(name = "logradouro")
        private String logradouro;

        @Column(name = "cep")
        private String cep;

        @Column(name = "numero")
        private String numero;
}
