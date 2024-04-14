// MOD_LOADED rftools
crafting.removeByOutput(item('rftools:machine_frame'))
crafting.removeByOutput(item('rftools:machine_base'))
crafting.removeByOutput(item('rftools:storage_scanner'))
crafting.removeByOutput(item('rftoolsdim:dimension_builder'))
// machine blocks
crafting.shapedBuilder()
    .key('e',ore('plateElectrum'))
    .key('m',ore('machineBlockBasic'))
    .row(' e ')
    .row('eme')
    .row(' e ')
    .output(item('rftools:machine_frame'))
    .register()
// crafting.addShaped(item('rftools:machine_frame') * 1,[
//     [null,ore('plateElectrum'),null]
//     [ore('plateElectrum'),ore('machineBlockBasic'),ore('plateElectrum')]
//     [null,ore('plateElectrum'),null]
// ])
crafting.addShapeless(item('rftools:machine_base') * 2,[
    ore('craftingToolSaw'),item('rftools:machine_frame')
])
// storage
crafting.addShaped(item('rftools:storage_scanner'),[
    [ore('plateStainlessSteel'),ore('plateStainlessSteel'),ore('plateStainlessSteel')],
    [ore('circuitAdvanced'),item('rftools:machine_frame'),ore('circuitAdvanced')],
    [ore('plateStainlessSteel'),ore('plateStainlessSteel'),ore('plateStainlessSteel')]
])
crafting.addShaped(item('rftoolsdim:dimension_builder'),[
    [ore('plateTungstensteel'),ore('circuitUltimate'),ore('plateTungstensteel')],
    [item('rftools:machine_frame'),ore('machineBlockElite'),item('gtclassic:idsu')],
    [ore('plateTungstensteel'),ore('circuitUltimate'),ore('plateTungstensteel')]
])