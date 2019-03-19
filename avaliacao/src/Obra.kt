class Obra(var nome: String){
    private val insumosConsu = arrayListOf<InsumoConsu>()
    private val trabalhoDoEquip = arrayListOf<TrabalhoDoEquip>()
    private val usoMaoDeObra = arrayListOf<UsoMaoDeObra>()

    fun temInsumo(insumoConsumido: InsumoConsu){
        this.insumosConsu.add(insumoConsumido)
    }

    fun temFuncionarios(trabalhador: UsoMaoDeObra){
        this.usoMaoDeObra.add(trabalhador)
    }

    fun usouEquipamento(equipamento: TrabalhoDoEquip){
        this.trabalhoDoEquip.add(equipamento)
    }

    fun gastosTotaisComInsumos(): Int{
        var valorTotal: Int = 0
        for (insumo in insumosConsu){
            valorTotal += insumo.insumo.preco * insumo.quantidade
        }
        return valorTotal
    }

    fun gastosTotaisComMaoDeObra(): Int{
        var valorTotal: Int = 0
        for (trabalhador in usoMaoDeObra){
            valorTotal += trabalhador.maoDeObra.precoPorHora * trabalhador.horaTrabalhada
        }
        return valorTotal
    }

    fun gastosTotaisComEquipamento(): Int{
        var valorTotal: Int = 0
        for (equipamento in trabalhoDoEquip){
            valorTotal += equipamento.horas * equipamento.equipamento.custo
        }
        return valorTotal
    }

    fun gastosTotaisObra(): Int{
        return gastosTotaisComInsumos() + gastosTotaisComMaoDeObra() + gastosTotaisComEquipamento()
    }
}