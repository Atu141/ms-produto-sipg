package br.com.fiap.ms_produto.dto;


import br.com.fiap.ms_produto.entities.Loja;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class LojaDTO {

    private Long id;

    @NotBlank(message = "Nome da Loja Requerido")
    @Size(min = 3, max = 100, message = "O nome da loja deve ter no minimo 3 caracters")
    private String nome;

    public LojaDTO(Loja entity) {
        id = entity.getId();
        nome = entity.getNome();
    }

//    public Long getId() {
//        return id;
//    }
//
//    public String getNome() {
//        return nome;
//    }
}
