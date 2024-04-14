import ic2.core.block.machine.low.TileEntityMacerator
import gtclassic.common.recipe.GTRecipeMods
import exterminatorjeff.undergroundbiomes.api.API
import exterminatorjeff.undergroundbiomes.intermod.StonesRegistry
// import ic2.codre.block.machine.low.TileEntityMacerator;
// import ic2.api.recipe.Recipes
import ic2.api.classic.recipe.ClassicRecipes
import gtclassic.common.tile.GTTileCentrifuge
// Nether behind steel
crafting.removeByOutput(item('minecraft:flint_and_steel'));
crafting.addShapeless("flint_and_steel", item('minecraft:flint_and_steel'), [item('minecraft:flint'), ore('nuggetSteel')]);
// Remove Buildcraft Gears
crafting.removeByOutput(item('buildcraftcore:gear_iron'));
crafting.removeByOutput(item('buildcraftcore:gear_gold'));

// Remove Thermal Foundation Gear Recipes
crafting.removeByOutput(item('thermalfoundation:material:22'));
crafting.removeByOutput(item('thermalfoundation:material:23'));
crafting.removeByOutput(item('thermalfoundation:material:24'));
crafting.removeByOutput(item('thermalfoundation:material:25'));
crafting.removeByOutput(item('thermalfoundation:material:26'));
crafting.removeByOutput(item('thermalfoundation:material:256'));
crafting.removeByOutput(item('thermalfoundation:material:257'));
crafting.removeByOutput(item('thermalfoundation:material:258'));
crafting.removeByOutput(item('thermalfoundation:material:259'));
crafting.removeByOutput(item('thermalfoundation:material:260'));
crafting.removeByOutput(item('thermalfoundation:material:261'));
crafting.removeByOutput(item('thermalfoundation:material:262'));
crafting.removeByOutput(item('thermalfoundation:material:263'));
crafting.removeByOutput(item('thermalfoundation:material:264'));
crafting.removeByOutput(item('thermalfoundation:material:288'));
crafting.removeByOutput(item('thermalfoundation:material:289'));
crafting.removeByOutput(item('thermalfoundation:material:290'));
crafting.removeByOutput(item('thermalfoundation:material:291'));
crafting.removeByOutput(item('thermalfoundation:material:292'));
crafting.removeByOutput(item('thermalfoundation:material:293'));
crafting.removeByOutput(item('thermalfoundation:material:294'));
crafting.removeByOutput(item('thermalfoundation:material:295'));

// Remove IC2C Recipes
crafting.remove("ic2:shaped_item.bucket_-1334477105");

// Remove hand crafting of alloys from dusts
crafting.removeByOutput(item('immersiveengineering:metal:15'));
crafting.removeByOutput(item('immersiveengineering:metal:16'));
crafting.removeByOutput(item('thermalfoundation:material:97'));
crafting.removeByOutput(item('thermalfoundation:material:98'));
crafting.removeByOutput(item('thermalfoundation:material:99'));
crafting.removeByOutput(item('thermalfoundation:material:100'));
crafting.remove("ic2:shaped_item.itemdustiron_-779868215");
crafting.remove("ic2:shaped_item.itemdustiron_1576386918");

// Remove unnecessary gunpowder crafting
crafting.remove('railcraft:minecraft_gunpowder$1');
crafting.remove("thermalfoundation:gunpowder");
crafting.remove("thermalfoundation:gunpowder_1");
crafting.remove("immersiveengineering:material/gunpowder0");
crafting.remove("immersiveengineering:material/gunpowder1");

crafting.removeByOutput(item('ic2:itembatcrystal'))
crafting.removeByOutput(item('ic2c_extras:energiumdust'))
crafting.addShaped(item('ic2c_extras:energiumdust')*9,[
   [ore('dustRuby'),ore('dustRedstone'),ore('dustRuby')],
   [ore('dustRedstone'),ore('dustRuby'),ore('dustRedstone')],
   [ore('dustRuby'),ore('dustRedstone'),ore('dustRuby')],
])

// Move Quartz Glass and fiber part to alloy smelter
//todo move from zs to gs
// crafting.remove('appliedenergistics2:decorative/quartz_glass');
// mods.gtclassic.AlloySmelter.addRecipe(item('appliedenergistics2:quartz_glass') * 4, item('appliedenergistics2:material:2') * 5, item('minecraft:glass') * 4);
// mods.gtclassic.AlloySmelter.addRecipe(item('appliedenergistics2:quartz_glass') * 4, item('appliedenergistics2:material:3') * 5, item('minecraft:glass') * 4);

List stones = API.STONES_REGISTRY.allStones()
// List sands =
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
