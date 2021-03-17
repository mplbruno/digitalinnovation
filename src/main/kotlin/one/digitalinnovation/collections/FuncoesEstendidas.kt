package one.digitalinnovation.collections

import java.math.BigDecimal

// Somatoria numa Array do tipo BigDecimal (Essas funcoes
//somatoria e media nao existem no leque de Array

fun Array<BigDecimal>.somatoria() = this.reduce{
    acc, valor -> acc + valor
}
// função media
fun Array<BigDecimal>.media() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()