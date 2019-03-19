fun main(args: Array<String>){
    //Instância da Obra
    var obraUnifeob = Obra("Unifeob")

    //Instância das Locações
    var betoneira = Equipamento("Betoneira",25)
    var trator = Equipamento("Trator",15)
    var pa = Equipamento("Pá",2)

    var trabalhoBetoneira = TrabalhoDoEquip(betoneira,10)
    var trabalhoTrator = TrabalhoDoEquip(trator,5)
    var trabalhoPa = TrabalhoDoEquip(pa,2)

    //Instâncias dos Insumos
    var areia = Insumo("Areia",15)
    var cimento = Insumo("Cimento",50)
    var cal = Insumo("Cal",20)

    //Instância dos insumos consumidos
    var consumoAreia = InsumoConsu(areia,25)
    var consumoCimento = InsumoConsu(cimento,10)
    var consumoCal = InsumoConsu(cal,20)

    //Instâncias da Mão de Obra
    var pedreiro1 = MaoDeObra("Pedreiro 1",10)
    var pedreiro2 = MaoDeObra("Pedreiro 2",6)
    var pedreiro3 = MaoDeObra("Pedreiro 3",17)

    var trabalhoPedreiro1 = UsoMaoDeObra (pedreiro1, 10)
    var trabalhoPedreiro2 = UsoMaoDeObra (pedreiro1, 8)
    var trabalhoPedreiro3 = UsoMaoDeObra (pedreiro1, 12)

    //Atribuição dos insumos consumidos a obra
    obraUnifeob.temInsumo(consumoAreia)
    obraUnifeob.temInsumo(consumoCimento)
    obraUnifeob.temInsumo(consumoCal)

    //Atribuição dos trabalhadores usados a obra
    obraUnifeob.temFuncionarios(trabalhoPedreiro1)
    obraUnifeob.temFuncionarios(trabalhoPedreiro2)
    obraUnifeob.temFuncionarios(trabalhoPedreiro3)

    //Atribuição dos equipamentos que trabalharam a obra
    obraUnifeob.usouEquipamento(trabalhoBetoneira)
    obraUnifeob.usouEquipamento(trabalhoTrator)
    obraUnifeob.usouEquipamento(trabalhoPa)

    println("Obra sendo iniciada na: ${obraUnifeob.nome}")
    println("Os gastos totais com Insumos é de R$ ${obraUnifeob.gastosTotaisComInsumos()}")
    println("Os gastos totais com Mão de Obra é de R$ ${obraUnifeob.gastosTotaisComMaoDeObra()}")
    println("Os gastos totais com Equipamentos é de R$ ${obraUnifeob.gastosTotaisComEquipamento()}")
    println("Os gastos totais da Obra é de R$ ${obraUnifeob.gastosTotaisObra()}")
}