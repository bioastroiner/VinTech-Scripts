import com.cleanroommc.groovyscript.compat.mods.immersiveengineering.ArcFurnace
import gtc_expansion.tile.GTCXTileBath
import gtc_expansion.recipes.GTCXRecipeMods
import ic2.core.block.machine.low.TileEntityMacerator

// def blusunrize.immersiveengineering.api.tool.ExcavatorHandler$MineralMix vein(String _name){
//     blusunrize.immersiveengineering.api.tool.ExcavatorHandler$MineralMix mix = mods.immersiveengineering.excavator.streamRecipes()
//     return mix
// }
def blusunrize.immersiveengineering.api.tool.ExcavatorHandler$MineralMix allVeins(){
    blusunrize.immersiveengineering.api.tool.ExcavatorHandler$MineralMix mix = mods.immersiveengineering.excavator.streamRecipes().getList().iterator().next().getKey()
    return mix
}