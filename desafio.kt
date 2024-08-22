// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario (val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("${usuario.nome} foi matriculado na formação $nome.") 
    }
}

fun main() {
// Criando conteudo educacional
   val conteudoKotlin = ConteudoEducacional("Kotlin para Iniciantes", 120)
   val conteudoJava = ConteudoEducacional ("Java Avançado", 180)

// Criando formaçao
    val formacaoDesenvolvimento = Formacao("Formação Desenvolvimento", listOf(conteudoKotlin, conteudoJava))

// Criando usuários
    val usuario1 = Usuario("Juliana")
    val usuario2 = Usuario("Diego")

// Matriculando usuarios na formação
formacaoDesenvolvimento.matricular(usuario1)
formacaoDesenvolvimento.matricular(usuario2)

//Exibindo inscritos
println("Inscritos na formação ${formacaoDesenvolvimento.nome}:")
formacaoDesenvolvimento.inscritos.forEach {println(it.nome) }

}
