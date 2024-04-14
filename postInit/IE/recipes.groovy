import gtc_expansion.tile.GTCXTileBath
import gtc_expansion.recipes.GTCXRecipeMods
import ic2.core.block.machine.low.TileEntityMacerator

// bath recipe for treated wood (not forced!)
GTCXTileBath.addRecipe('plankWood',1,fluid('creosote'),200,item('immersiveengineering:treated_wood'))
// remove arc furnace from IBF materials
[
    item('gtclassic:aluminium_ingot'),
    item('gtclassic:tungsten_ingot'),
    item('gtclassic:tungstensteel_ingot'),
    item('gtclassic:titanium_ingot'),
    item('gtclassic:osmium_ingot'),
    item('gtclassic:stainlesssteel_ingot'),
    item('gtclassic:silicon_ingot'),
    item('gtclassic:chrome_ingot'),
    item('gtclassic:iridium_ingot'),
    item('gtclassic:kanthal_ingot'),
    item('gtclassic:nichrome_ingot')
].iterator().forEachRemaining({toRemove -> 
    log.debug("removing $toRemove from Arc Furnace")
    mods.immersiveengineering.arcFurnace.removeByOutput(toRemove)
})
// dsnt work :(
// mods.immersiveengineering.blueprint.removeByOutput(item('immersiveengineering:material', 8))
// mods.immersiveengineering.blueprint.removeByOutput(item('immersiveengineering:material', 9))
def keys = [
    'R': ore('plateRedAlloy'),
    'C': ore('plateCopper'),
    'I': ore('plateIron'),
    'S': ore('plateSteel'),
    'E': ore('plateElectrum'),
    '1': ore('machineBlockCheap'),
    'h': ore('craftingToolForgeHammer'),
    'w': ore('craftingToolWrench')
]
// remove plate form hammers
crafting.removeByInput(item('immersiveengineering:tool'))
crafting.removeByOutput(item('immersiveengineering:metal_decoration0', 3),true)
crafting.removeByOutput(item('immersiveengineering:metal_decoration0', 4),true)
crafting.removeByOutput(item('immersiveengineering:metal_decoration0', 5),true)
// Redstone Eng
crafting.shapedBuilder()
    .key('R',ore('plateRedAlloy'))
    .key('C',ore('plateCopper'))
    .key('I',ore('plateIron'))
    .key('h',ore('craftingToolForgeHammer'))
    .key('w',ore('craftingToolWrench'))
    .row("IRI")
    .row("wCh")
    .row("IRI")
    .output(item('immersiveengineering:metal_decoration0', 3))
    .register()
// Light Eng
crafting.shapedBuilder()
    .key('P',item('immersiveengineering:material', 8))
    .key('I',ore('plateIron'))
    .key('h',ore('craftingToolForgeHammer'))
    .key('w',ore('craftingToolWrench'))
    .key('1',ore('machineBlockCheap'))
    .row("IPI")
    .row("w1h")
    .row("IPI")
    .output(item('immersiveengineering:metal_decoration0', 4) * 6)
    .register()
// Heavy Eng
crafting.shapedBuilder()
    .key('P',item('immersiveengineering:material', 9))
    .key('E',ore('plateElectrum'))
    .key('S',ore('plateSteel'))
    .key('h',ore('craftingToolForgeHammer'))
    .key('w',ore('craftingToolWrench'))
    .key('s',ore('craftingToolSaw'))
    .key('2',ore('machineBlockBasic'))
    .row("SsS")
    .row("P2P")
    .row("wEh")
    .output(item('immersiveengineering:metal_decoration0', 5) * 6)
    .register()
// compounds
crafting.shapedBuilder()
    .key('S',ore('stickIron'))
    .key('P',ore('plateCopper'))
    .key('w',ore('craftingToolWrench'))
    .row('SwS').row(' P ').row('S S')
    .output(item('immersiveengineering:material', 8)*2)
    .register()
crafting.shapedBuilder()
    .key('S',ore('stickSteel'))
    .key('P',ore('plateBronze'))
    .key('w',ore('craftingToolWrench'))
    .row('SwS').row(' P ').row('S S')
    .output(item('immersiveengineering:material', 9)*2)
    .register()