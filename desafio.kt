// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val id: Int, var nome: String, var email: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, var nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, var nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(vararg usuarios: Usuario) {
    
        for(usuario in usuarios) {
            inscritos.add(usuario)
        }
    }
}

fun main() {

    val usuario1 = Usuario(1, "Jennifer", "jeni@gmail.com")
    val usuario2 = Usuario(2, "Joilson", "jpw@gmail.com")
    val usuario3 = Usuario(3, "Dorime", "mickeyMouse@gmail.com")
    val usuario4 = Usuario(4, "Conde", "dracula@gmail.com")

    val curso1 = ConteudoEducacional("Princípios de Kotlin", 60, Nivel.BASICO)
    val curso2 = ConteudoEducacional("Orientação a objetos", 60, Nivel.BASICO)
    val curso3 = ConteudoEducacional("APIs com Kotlin", 120, Nivel.INTERMEDIARIO)
    val conteudos = listOf(curso1, curso2, curso3)

    val formacao = Formacao("Formação Kotlin", conteudos, Nivel.INTERMEDIARIO)

    formacao.matricular(usuario1, usuario2, usuario3)
    formacao.matricular(usuario4)

    println(conteudos)
    println(formacao.inscritos)
}
