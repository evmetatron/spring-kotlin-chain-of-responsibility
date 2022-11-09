package com.github.evmetatron.springkotlinchainofresponsibility.chain

class ChainB(
    private val exampleDependency: ExampleDependency,
    private val chainInterface: ChainInterface?,
) : ChainInterface {
    override fun next(): ChainInterface? = chainInterface

    fun getText(text: String): String = exampleDependency.getText(text)
}
