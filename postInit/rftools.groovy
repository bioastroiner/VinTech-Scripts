// MOD_LOADED rftools
crafting.removeByOutput(item('rftools:machineFrame'))
crafting.removeByOutput(item('rftools:machineBase'))
crafting.removeByOutput(item('rftools:storageScannerBlock'))
crafting.removeByOutput(item('rftools:dimensionBuilderBlock'))

crafting.addShaped(item('rftools:machineFrame') * 2,[
    [ore('plateElectrum'),ore('plateElectrum'),ore('plateElectrum')]
    [ore('plateElectrum'),ore('machineBlockBasic'),ore('plateElectrum')]
    [ore('plateElectrum'),ore('plateElectrum'),ore('plateElectrum')]
])
crafting.addShapeless(item('rftools:machineBase') * 4,[
    ore('craftingToolSaw'),item('rftools:machineFrame')
])
crafting.addShaped(item('rftools:storageScannerBlock'),[
    [ore('plateStainlessSteel'),ore('plateStainlessSteel'),ore('plateStainlessSteel')],
    [ore('circuitAdvanced'),item('rftools:machineFrame'),ore('circuitAdvanced')]
    [ore('plateStainlessSteel'),ore('plateStainlessSteel'),ore('plateStainlessSteel')]
])