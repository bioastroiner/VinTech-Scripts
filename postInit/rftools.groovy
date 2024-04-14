// MOD_LOADED rftools
crafting.removeByOutput(item('rftools:machine_frame'))
// machine blocks
crafting.shapedBuilder()
    .key('e',ore('plateElectrum'))
    .key('m',ore('machineBlockBasic'))
    .row(' e ')
    .row('eme')
    .row(' e ')
    .output(item('rftools:machine_frame'))
    .register()
// crafting.replaceShaped(item('rftools:machine_frame') * 1,[
//     [null,ore('plateElectrum'),null]
//     [ore('plateElectrum'),ore('machineBlockBasic'),ore('plateElectrum')]
//     [null,ore('plateElectrum'),null]
// ])
crafting.replaceShapeless(item('rftools:machine_base') * 2,[
    ore('craftingToolSaw'),item('rftools:machine_frame')
])
// storage
crafting.replaceShaped(item('rftools:storage_scanner'),[
    [ore('plateStainlessSteel'),ore('plateStainlessSteel'),ore('plateStainlessSteel')],
    [ore('circuitAdvanced'),item('rftools:machine_frame'),ore('circuitAdvanced')],
    [ore('plateStainlessSteel'),ore('plateStainlessSteel'),ore('plateStainlessSteel')]
])
crafting.replaceShaped(item('rftoolsdim:dimension_builder'),[
    [ore('plateTungstensteel'),ore('circuitUltimate'),ore('plateTungstensteel')],
    [item('rftools:machine_frame'),ore('machineBlockElite'),item('gtclassic:idsu')],
    [ore('plateTungstensteel'),ore('circuitUltimate'),ore('plateTungstensteel')]
])