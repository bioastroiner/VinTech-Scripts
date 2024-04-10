import ic2.core.block.machine.low.TileEntityMacerator
import gtclassic.common.recipe.GTRecipeMods
import exterminatorjeff.undergroundbiomes.api.API
import exterminatorjeff.undergroundbiomes.intermod.StonesRegistry
// import ic2.codre.block.machine.low.TileEntityMacerator;
// import ic2.api.recipe.Recipes
import ic2.api.classic.recipe.ClassicRecipes
import gtclassic.common.tile.GTTileCentrifuge

List stones = API.STONES_REGISTRY.allStones()
// List sands =
// UndergroundBiomes
// gravel from cobblestone
crusher(item('undergroundbiomes:igneous_gravel'), item('undergroundbiomes:igneous_cobble'), item('minecraft:sand'))
crusher(item('undergroundbiomes:igneous_gravel:1'), item('undergroundbiomes:igneous_cobble:1'), item('minecraft:sand'))
crusher(item('undergroundbiomes:igneous_gravel:2'), item('undergroundbiomes:igneous_cobble:2'), item('minecraft:sand'))
crusher(item('undergroundbiomes:igneous_gravel:3'), item('undergroundbiomes:igneous_cobble:3'), item('minecraft:sand'))
crusher(item('undergroundbiomes:igneous_gravel:4'), item('undergroundbiomes:igneous_cobble:4'), item('minecraft:sand'))
crusher(item('undergroundbiomes:igneous_gravel:5'), item('undergroundbiomes:igneous_cobble:5'), item('minecraft:sand'))
crusher(item('undergroundbiomes:igneous_gravel:6'), item('undergroundbiomes:igneous_cobble:6'), item('minecraft:sand'))
crusher(item('undergroundbiomes:igneous_gravel:7'), item('undergroundbiomes:igneous_cobble:7'), item('minecraft:sand'))
crusher(item('undergroundbiomes:metamorphic_gravel'), item('undergroundbiomes:metamorphic_cobble'), item('minecraft:sand'))
crusher(item('undergroundbiomes:metamorphic_gravel:1'), item('undergroundbiomes:metamorphic_cobble:1'), item('minecraft:sand'))
crusher(item('undergroundbiomes:metamorphic_gravel:2'), item('undergroundbiomes:metamorphic_cobble:2'), item('minecraft:sand'))
crusher(item('undergroundbiomes:metamorphic_gravel:3'), item('undergroundbiomes:metamorphic_cobble:3'), item('minecraft:sand'))
crusher(item('undergroundbiomes:metamorphic_gravel:4'), item('undergroundbiomes:metamorphic_cobble:4'), item('minecraft:sand'))
crusher(item('undergroundbiomes:metamorphic_gravel:5'), item('undergroundbiomes:metamorphic_cobble:5'), item('minecraft:sand'))
crusher(item('undergroundbiomes:metamorphic_gravel:6'), item('undergroundbiomes:metamorphic_cobble:6'), item('minecraft:sand'))
crusher(item('undergroundbiomes:metamorphic_gravel:7'), item('undergroundbiomes:metamorphic_cobble:7'), item('minecraft:sand'))
crusher(item('undergroundbiomes:sedimentary_gravel'), item('undergroundbiomes:sedimentary_stone'), item('minecraft:sand'))
crusher(item('undergroundbiomes:sedimentary_gravel:1'), item('undergroundbiomes:sedimentary_stone:1'), item('minecraft:sand'))
crusher(item('undergroundbiomes:sedimentary_gravel:2'), item('undergroundbiomes:sedimentary_stone:2'), item('minecraft:sand'))
crusher(item('undergroundbiomes:sedimentary_gravel:3'), item('undergroundbiomes:sedimentary_stone:3'), item('minecraft:sand'))
crusher(item('undergroundbiomes:sedimentary_gravel:4'), item('undergroundbiomes:sedimentary_stone:4'), item('minecraft:sand'))
crusher(item('undergroundbiomes:sedimentary_gravel:5'), item('undergroundbiomes:sedimentary_stone:5'), item('minecraft:sand'))
crusher(item('undergroundbiomes:sedimentary_gravel:6'), item('undergroundbiomes:sedimentary_stone:6'), item('minecraft:sand'))
crusher(item('undergroundbiomes:sedimentary_gravel:7'), item('undergroundbiomes:sedimentary_stone:7'), item('minecraft:sand'))
crusher(item('undergroundbiomes:igneous_sand') * 4, item('undergroundbiomes:igneous_sandstone'))
crusher(item('undergroundbiomes:igneous_sand:1') * 4, item('undergroundbiomes:igneous_sandstone:1'))
crusher(item('undergroundbiomes:igneous_sand:2') * 4, item('undergroundbiomes:igneous_sandstone:2'))
crusher(item('undergroundbiomes:igneous_sand:3') * 4, item('undergroundbiomes:igneous_sandstone:3'))
crusher(item('undergroundbiomes:igneous_sand:4') * 4, item('undergroundbiomes:igneous_sandstone:4'))
crusher(item('undergroundbiomes:igneous_sand:5') * 4, item('undergroundbiomes:igneous_sandstone:5'))
crusher(item('undergroundbiomes:igneous_sand:6') * 4, item('undergroundbiomes:igneous_sandstone:6'))
crusher(item('undergroundbiomes:igneous_sand:7') * 4, item('undergroundbiomes:igneous_sandstone:7'))
crusher(item('undergroundbiomes:metamorphic_sand') * 4, item('undergroundbiomes:metamorphic_sandstone'))
crusher(item('undergroundbiomes:metamorphic_sand:1') * 4, item('undergroundbiomes:metamorphic_sandstone:1'))
crusher(item('undergroundbiomes:metamorphic_sand:2') * 4, item('undergroundbiomes:metamorphic_sandstone:2'))
crusher(item('undergroundbiomes:metamorphic_sand:3') * 4, item('undergroundbiomes:metamorphic_sandstone:3'))
crusher(item('undergroundbiomes:metamorphic_sand:4') * 4, item('undergroundbiomes:metamorphic_sandstone:4'))
crusher(item('undergroundbiomes:metamorphic_sand:5') * 4, item('undergroundbiomes:metamorphic_sandstone:5'))
crusher(item('undergroundbiomes:metamorphic_sand:6') * 4, item('undergroundbiomes:metamorphic_sandstone:6'))
crusher(item('undergroundbiomes:metamorphic_sand:7') * 4, item('undergroundbiomes:metamorphic_sandstone:7'))
crusher(item('undergroundbiomes:sedimentary_sand') * 4, item('undergroundbiomes:sedimentary_sandstone'))
crusher(item('undergroundbiomes:sedimentary_sand:1') * 4, item('undergroundbiomes:sedimentary_sandstone:1'))
crusher(item('undergroundbiomes:sedimentary_sand:2') * 4, item('undergroundbiomes:sedimentary_sandstone:2'))
crusher(item('undergroundbiomes:sedimentary_sand:3') * 4, item('undergroundbiomes:sedimentary_sandstone:3'))
crusher(item('undergroundbiomes:sedimentary_sand:4') * 4, item('undergroundbiomes:sedimentary_sandstone:4'))
crusher(item('undergroundbiomes:sedimentary_sand:5') * 4, item('undergroundbiomes:sedimentary_sandstone:5'))
crusher(item('undergroundbiomes:sedimentary_sand:6') * 4, item('undergroundbiomes:sedimentary_sandstone:6'))
crusher(item('undergroundbiomes:sedimentary_sand:7') * 4, item('undergroundbiomes:sedimentary_sandstone:7'))
//---Gravel Processing---
def centrifuge(ItemStack input,ItemStack output1,float chance1){
   centrifuge(input,output1,chance1,null,null,null,null)
}
def centrifuge(ItemStack input,ItemStack output1,float chance1,ItemStack output2,float chance2){
   centrifuge(input,output1,chance1,output2,chance2,null,null)
}
def centrifuge(ItemStack input,ItemStack output1,float chance1,ItemStack output2,float chance2,ItemStack output3,float chance3){
   // addRecipe(net.minecraft.item.ItemStack, int, [Lic2.api.classic.recipe.RecipeModifierHelpers$IRecipeModifier;, [Lnet.minecraft.item.ItemStack;)
   //types: (net.minecraft.item.ItemStack, Integer, [Lic2.api.classic.recipe.RecipeModifierHelpers$IRecipeModifier;...) 
   //values: [1xtile.igneous_gravel@0, 0, [ic2.api.classic.recipe.RecipeModifierHelpers$RecipeModifierInt@8008e43], ...]
   
   // FIXME 
   GTTileCentrifuge.addRecipe(input,0,GTTileCentrifuge.totalEu(8000),output1,output2,output3)
}
def crusher(ItemStack output, ItemStack input) {
    crusher(output, input,null)
}
def crusher(ItemStack output, ItemStack input, ItemStack secondry) {
    int ieCrusherCost = 2048
   //  float secChance = 0.1f
    mods.immersiveengineering.crusher.add(output, input,ieCrusherCost)
    TileEntityMacerator.addRecipe(input,output)
   //  println(input.displayName())
   // log.debug(input + ' added ',input)
}
// //red granite
// centrifuge(item('undergroundbiomes:igneous_gravel'),
//    ore('dustFeldspar')[0], 0.55,
//    item('minecraft:quartz'), 0.25,
//    ore('dustMica')[0],0.05)
// //black granite
// centrifuge(item('undergroundbiomes:igneous_gravel:1'),
//    ore('dustFeldspar')[0], 0.55,
//    item('minecraft:quartz'), 0.25,
//    ore('dustMica')[0],0.05)
// //Rhyolite
// centrifuge(item('undergroundbiomes:igneous_gravel:2'),
//    ore('dustFeldspar')[0], 0.55,
//    item('minecraft:quartz'), 0.25,
//    ore('dustMica')[0],0.05)
// //Andesite
// centrifuge(item('undergroundbiomes:igneous_gravel:3'),
//    ore('dustFeldspar')[0], 0.55,
//    ore('dustAmphibole')[0], 0.2,
//    ore('dustMica')[0],0.05)
// //Gabbro
// centrifuge(item('undergroundbiomes:igneous_gravel:4'),
//    ore('dustPyroxene')[0], 0.75,
//    ore('dustFeldspar')[0],0.5,
//    ore('dustOlivine')[0],0.5)
// //Basalt
// centrifuge(item('undergroundbiomes:igneous_gravel:5'),
//    ore('dustPyroxene')[0], 0.75,
//    ore('dustFeldspar')[0],0.5,
//    ore('dustOlivine')[0],0.5)
// // Komatiite
// centrifuge(item('undergroundbiomes:igneous_gravel:6'),
//    ore('dustPyroxene')[0], 0.5,
//    ore('dustOlivine')[0], 0.5)
// //Dacite
// centrifuge(item('undergroundbiomes:igneous_gravel:7'),
//    ore('dustFeldspar')[0], 0.4,
//    ore('dustAmphibole')[0] ,0.5,
//    ore('dustMica')[0] ,0.05)
// //Gneiss
// centrifuge(item('undergroundbiomes:metamorphic_gravel'),
//    ore('dustFeldspar')[0], 0.70,
//    ore('dustAmphibole')[0], 0.2,
//    ore('dustMica')[0], 0.05)
// //Eclogite
// centrifuge(item('undergroundbiomes:metamorphic_gravel:1'),
//    ore('dustPyroxene')[0], 0.5,
//    ore('dustGarnet')[0], 0.50)
// //Marble
// centrifuge(item('undergroundbiomes:metamorphic_gravel:2'),
//    ore('dustCalcite')[0], 0.50,
//    ore('dustDolomite')[0], 0.50,
//    item('gtclassic:marble_dust'), 0.6)
// //Quartzite
// centrifuge(item('undergroundbiomes:metamorphic_gravel:3'),
//    item('minecraft:quartz'), 0.95,
//    ore('dustIron')[0], 0.05)
// //blue Schist
// centrifuge(item('undergroundbiomes:metamorphic_gravel:4'),
//    ore('dustPyroxene')[0], 0.75,
//    ore('dustFeldspar')[0],0.5,
//    ore('dustOlivine')[0],0.5)
// //green Schist
// centrifuge(item('undergroundbiomes:metamorphic_gravel:5'),
//    ore('dustPyroxene')[0], 0.75,
//    ore('dustFeldspar')[0],0.5,
//    ore('dustOlivine')[0],0.5)
// //soapstone
// centrifuge(item('undergroundbiomes:metamorphic_gravel:6'),
//    ore('dustTalc')[0], 0.95,
//    ore('dustAmphibole')[0], 0.05)
// //migmatite
// centrifuge(item('undergroundbiomes:metamorphic_gravel:7'),
//    ore('dustFeldspar')[0], 0.55,
//    ore('dustMica')[0],0.5
//    item('minecraft:quartz'), 0.25)
// //limestone
// centrifuge(item('undergroundbiomes:sedimentary_gravel'),
//    ore('dustCalcite')[0], 1.0,
//    ore('dustPhosphorite')[0], 0.05)
// //chalk
// centrifuge(item('undergroundbiomes:sedimentary_gravel:1'),
//    ore('dustCalcite')[0], 1.0,
//    ore('dustPhosphorite')[0], 0.05)
//    // item('trinity:gem_witherite')0)
// //shale
// centrifuge(item('undergroundbiomes:sedimentary_gravel:2'),
//    ore('dustMica')[0], 0.65,
//    item('minecraft:quartz'), 0.45)
// //siltstone
// centrifuge(item('undergroundbiomes:sedimentary_gravel:3'),
//    item('minecraft:quartz'), 0.70,
//    ore('dustFeldspar')[0], 0.30,
//    ore('dustPhosphorite')[0], 0.05)
// //Dolomite
// centrifuge(item('undergroundbiomes:sedimentary_gravel:5'),
//    ore('dustDolomite')[0], 1.0)
//    // item('nuclearcraft:gem'),
//    // item('trinity:gem_witherite')0)
// //greywacke
// centrifuge(item('undergroundbiomes:sedimentary_gravel:6'),
//    ore('dustFeldspar')[0], 0.5,
//    item('minecraft:quartz'), 0.4,
//    ore('dustCalcite')[0])
// //chert
// centrifuge(item('undergroundbiomes:sedimentary_gravel:6'),
//    item('minecraft:quartz'), 0.95,
//    ore('dustIron')[0], 0.05)
