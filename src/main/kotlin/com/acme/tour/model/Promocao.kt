package com.acme.tour.model

import javax.persistence.*

@Entity
//@Table(name = "TBL_PROMOCAO")
data class Promocao (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 1,
    val descricao: String = "",
    val local: String = "",
    val isAllInclusive: Boolean = false,
    //@Column(name = "quantidadeDeDias")
    val qtdDias: Int = 1,
    val preco: Double = 0.0
)