import com.cleanroommc.groovyscript.compat.mods.immersiveengineering.ArcFurnace
import gtc_expansion.tile.GTCXTileBath
import gtc_expansion.recipes.GTCXRecipeMods
import ic2.core.block.machine.low.TileEntityMacerator
boolean remove = true

crafting.removeByInput(item('immersiveengineering:tool'))
GTCXTileBath.addRecipe('plankWood',1,fluid('creosote'),200,item('immersiveengineering:treated_wood'))
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
    item('gtclassic:nichrome_ingot'),
].iterator().forEachRemaining({toRemove -> 
    mods.immersiveengineering.arcFurnace.removeByOutput(toRemove)
})
// mods.immersiveengineering.blueprint.removeByOutput(item('immersiveengineering:material', 8))
// mods.immersiveengineering.blueprint.removeByOutput(item('immersiveengineering:material', 9))
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
    .key('C',ore('plateBronze'))
    .key('I',ore('plateIron'))
    .key('h',ore('craftingToolForgeHammer'))
    .key('w',ore('craftingToolWrench'))
    .key('B',ore('machineBlockCheap'))
    .row("IPI")
    .row("wBh")
    .row("IPI")
    .output(item('immersiveengineering:metal_decoration0', 4) * 6)
    .register()
// Heavy Eng
crafting.shapedBuilder()
    .key('C',item('immersiveengineering:material', 9))
    .key('E',ore('plateElectrum'))
    .key('S',ore('plateSteel'))
    .key('h',ore('craftingToolForgeHammer'))
    .key('w',ore('craftingToolWrench'))
    .key('s',ore('craftingToolSaw'))
    .key('B',ore('machineBlockBasic'))
    .row("SsS")
    .row("CBC")
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

if(remove){
    log.debug("Removing all excavator veins...")
    mods.immersiveengineering.excavator.removeAll()
}
mods.immersiveengineering.excavator.recipeBuilder()
    .name('garnet')
    // .ore(item('gtclassic:redgarnet_gem'))
    // .ore(item('gtclassic:yellowgarnet_gem'))
    .ore('gemRedGarnet',10)
    .ore('gemYellowGarnet',10)
    .weight(2000)
    .fail(0.1)
    .dimension(1)
    .register()
mods.immersiveengineering.excavator.recipeBuilder()
    .name('bauxite')
    .ore('oreBauxite',70)
    .weight(10000)
    .fail(0.3)
    .dimension(1)
    .register()
mods.immersiveengineering.excavator.recipeBuilder()
    .name('galena')
    .ore('oreGalena',80)
    .weight(20000)
    .fail(0.2)
    .dimension(1)
    .register()
mods.immersiveengineering.excavator.recipeBuilder()
    .name('cinnabar')
    .ore('oreCinnabar',30)
    .ore('oreRedstone',50)
    .ore('oreClathrateRedstone',10)
    .weight(15000)
    .fail(0.5)
    .dimension(1)
    .register()

mods.immersiveengineering.excavator.recipeBuilder()
    .name('sheldonite')
    .ore('oreSheldonite',10)

// def blusunrize.immersiveengineering.api.tool.ExcavatorHandler$MineralMix vein(String _name){
//     blusunrize.immersiveengineering.api.tool.ExcavatorHandler$MineralMix mix = mods.immersiveengineering.excavator.streamRecipes()
//     return mix
// }
def blusunrize.immersiveengineering.api.tool.ExcavatorHandler$MineralMix allVeins(){
    blusunrize.immersiveengineering.api.tool.ExcavatorHandler$MineralMix mix = mods.immersiveengineering.excavator.streamRecipes().getList().iterator().next().getKey()
    return mix
}
// mods.immersiveengineering.excavator.recipeBuilder()
//     .name('demo')
//     .weight(2000)
//     .fail(0.1)
//     .ore(ore('blockDiamond'), 50)
//     .dimension(-1, 1)
//     .blacklist()
//     .register()

// // Alloy Kiln:
// // Converts two input itemstacks into an output itemstack, consuming fuel (based on burn time).

// mods.immersiveengineering.alloy_kiln.removeByInput(item('minecraft:gold_ingot'), item('immersiveengineering:metal:3'))
// mods.immersiveengineering.alloy_kiln.removeByOutput(item('immersiveengineering:metal:6'))
// // mods.immersiveengineering.alloy_kiln.removeAll()

// mods.immersiveengineering.alloy_kiln.recipeBuilder()
//     .input(item('minecraft:diamond'), ore('ingotGold'))
//     .output(item('minecraft:clay'))
//     .register()



// // Arc Furnace:
// // Converts 1 input itemstack with up to 4 additional inputs into an output itemstack and an optional 'slag' itemstack,
// // taking time and using rf power.

// mods.immersiveengineering.arc_furnace.removeByInput(item('immersiveengineering:metal:18'), item('immersiveengineering:material:17'))
// mods.immersiveengineering.arc_furnace.removeByOutput(item('immersiveengineering:metal:7'))
// // mods.immersiveengineering.arc_furnace.removeAll()

// mods.immersiveengineering.arc_furnace.recipeBuilder()
//     .mainInput(item('minecraft:diamond'))
//     .input(item('minecraft:diamond'), ore('ingotGold'))
//     .output(item('minecraft:clay'))
//     .time(100)
//     .energyPerTick(100)
//     .slag(item('minecraft:gold_nugget'))
//     .register()



// // Blast Furnace:
// // Converts an input itemstack into an output itemstack and an optional 'slag' itemstack, taking time and consuming fuel
// // (based on Blast Furnace Fuels).

// mods.immersiveengineering.blast_furnace.removeByInput(item('minecraft:iron_block'))
// mods.immersiveengineering.blast_furnace.removeByOutput(item('immersiveengineering:metal:8'))
// // mods.immersiveengineering.blast_furnace.removeAll()

// mods.immersiveengineering.blast_furnace.recipeBuilder()
//     .input(item('minecraft:diamond'))
//     .output(item('minecraft:clay'))
//     .time(100)
//     .slag(item('minecraft:gold_nugget'))
//     .register()



// // Blast Furnace Fuel:
// // Allows an item to be used in the Blast Furnace as a fuel for the given number of ticks.

// mods.immersiveengineering.blast_furnace_fuel.removeByInput(item('immersiveengineering:material:6'))
// // mods.immersiveengineering.blast_furnace_fuel.removeAll()

// mods.immersiveengineering.blast_furnace_fuel.recipeBuilder()
//     .input(item('minecraft:clay'))
//     .time(100)
//     .register()



// // Blueprint Crafting:
// // Converts any number of input itemstacks into an output itemstack, using a blueprint with the category nbt tag as a
// // catalyst.

// mods.immersiveengineering.blueprint_crafting.removeByCategory('electrode')
// mods.immersiveengineering.blueprint_crafting.removeByInput('components', item('immersiveengineering:metal:38'), item('immersiveengineering:metal:38'), item('immersiveengineering:metal'))
// mods.immersiveengineering.blueprint_crafting.removeByOutput('components', item('immersiveengineering:material:8'))
// // mods.immersiveengineering.blueprint_crafting.removeAll()

// mods.immersiveengineering.blueprint_crafting.recipeBuilder()
//     .input(item('minecraft:diamond'), ore('ingotGold'))
//     .output(item('minecraft:clay'))
//     .category('groovy')
//     .register()



// // Bottling Machine:
// // Converts an input itemstack and fluidstack into an output itemstack.

// mods.immersiveengineering.bottling_machine.removeByInput(item('minecraft:sponge'), fluid('water') * 1000)
// mods.immersiveengineering.bottling_machine.removeByOutput(item('minecraft:potion').withNbt([Potion:'minecraft:mundane']))
// // mods.immersiveengineering.bottling_machine.removeAll()

// mods.immersiveengineering.bottling_machine.recipeBuilder()
//     .input(item('minecraft:diamond'))
//     .fluidInput(fluid('water'))
//     .output(item('minecraft:clay'))
//     .register()



// // Coke Oven:
// // Converts an input itemstack into an output itemstack over time, producing a given amount of creosote oil.

// mods.immersiveengineering.coke_oven.removeByInput(item('minecraft:log'))
// mods.immersiveengineering.coke_oven.removeByOutput(item('immersiveengineering:material:6'))
// // mods.immersiveengineering.coke_oven.removeAll()

// mods.immersiveengineering.coke_oven.recipeBuilder()
//     .input(item('minecraft:diamond'))
//     .output(item('minecraft:clay'))
//     .time(100)
//     .creosote(50)
//     .register()



// // Crusher:
// // Converts an input itemstack into an output itemstack, consuming energy.

// mods.immersiveengineering.crusher.removeByInput(item('immersiveengineering:material:7'))
// mods.immersiveengineering.crusher.removeByOutput(item('minecraft:sand'))
// // mods.immersiveengineering.crusher.removeAll()

// mods.immersiveengineering.crusher.recipeBuilder()
//     .input(item('minecraft:diamond'))
//     .output(item('minecraft:clay'))
//     .energy(100)
//     .register()





// // Fermenter:
// // Converts an input itemstack into an output fluidstack with an optional output itemstack, consuming power.

// mods.immersiveengineering.fermenter.removeByInput(item('minecraft:reeds'))
// mods.immersiveengineering.fermenter.removeByOutput(fluid('ethanol'))
// // mods.immersiveengineering.fermenter.removeAll()

// mods.immersiveengineering.fermenter.recipeBuilder()
//     .input(item('minecraft:diamond'))
//     .output(item('minecraft:clay'))
//     .fluidOutput(fluid('water'))
//     .energy(100)
//     .register()



// // Metal Press:
// // Converts an input itemstack into an output itemstack, with a mold catalyst, consuming power.

// mods.immersiveengineering.metal_press.removeByInput(item('minecraft:iron_ingot'))
// mods.immersiveengineering.metal_press.removeByInput(item('immersiveengineering:mold'), item('immersiveengineering:metal:8'))
// mods.immersiveengineering.metal_press.removeByMold(item('immersiveengineering:mold:4'))
// mods.immersiveengineering.metal_press.removeByOutput(item('immersiveengineering:material:2'))
// mods.immersiveengineering.metal_press.removeByOutput(item('immersiveengineering:mold'), item('immersiveengineering:metal:31'))
// // mods.immersiveengineering.metal_press.removeAll()

// mods.immersiveengineering.metal_press.recipeBuilder()
//     .mold(item('minecraft:diamond'))
//     .input(ore('ingotGold'))
//     .output(item('minecraft:clay'))
//     .energy(100)
//     .register()



// // Mixer:
// // Converts any number of input itemstacks and a fluidstack into an output fluidstack, consuming power.

// mods.immersiveengineering.mixer.removeByInput(fluid('water'), item('minecraft:speckled_melon'))
// mods.immersiveengineering.mixer.removeByInput(item('minecraft:sand'), item('minecraft:sand'), item('minecraft:clay_ball'), item('minecraft:gravel'))
// mods.immersiveengineering.mixer.removeByOutput(fluid('potion').withNbt([Potion:'minecraft:night_vision']))
// // mods.immersiveengineering.mixer.removeAll()

// mods.immersiveengineering.mixer.recipeBuilder()
//     .input(item('minecraft:diamond'), ore('ingotGold'), ore('ingotGold'), ore('ingotGold'))
//     .fluidInput(fluid('water'))
//     .fluidOutput(fluid('lava'))
//     .energy(100)
//     .register()



// // Refinery:
// // Converts 2 input fluidstacks into an output fluidstack, consuming power.

// mods.immersiveengineering.refinery.removeByInput(fluid('plantoil'), fluid('ethanol'))
// // mods.immersiveengineering.refinery.removeByOutput(fluid('biodiesel'))
// // mods.immersiveengineering.refinery.removeAll()

// mods.immersiveengineering.refinery.recipeBuilder()
//     .fluidInput(fluid('water'), fluid('water'))
//     .fluidOutput(fluid('lava'))
//     .energy(100)
//     .register()



// // Squeezer:
// // Converts an input itemstack into either an output itemstack, fluidstack, or both, using energy.

// mods.immersiveengineering.squeezer.removeByInput(item('minecraft:wheat_seeds'))
// mods.immersiveengineering.squeezer.removeByOutput(fluid('plantoil'))
// mods.immersiveengineering.squeezer.removeByOutput(item('immersiveengineering:material:18'))
// // mods.immersiveengineering.squeezer.removeAll()

// mods.immersiveengineering.squeezer.recipeBuilder()
//     .input(item('minecraft:diamond'))
//     .output(item('minecraft:clay'))
//     .fluidOutput(fluid('lava'))
//     .energy(100)
//     .register()

// mods.immersiveengineering.squeezer.recipeBuilder()
//     .input(item('minecraft:gold_ingot'))
//     .output(item('minecraft:clay'))
//     .energy(100)
//     .register()

// mods.immersiveengineering.squeezer.recipeBuilder()
//     .input(item('minecraft:clay'))
//     .fluidOutput(fluid('water'))
//     .energy(100)
//     .register()



