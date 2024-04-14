import com.cleanroommc.groovyscript.api.IIngredient
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.client.FMLClientHandler
import net.minecraftforge.fml.common.FMLCommonHandler
import net.minecraftforge.registries.IForgeRegistryEntry$Impl
import net.minecraft.item.crafting.ShapelessRecipes
import net.minecraft.item.crafting.ShapedRecipes

// crafting.streamRecipes().forEach({
//     r -> {
//         if(r instanceof ShapelessRecipes){
//             ShapelessRecipes recipe = r
//             if(isLP(recipe.recipeOutput)){
//                 for (IIngredient item in recipe.recipeItems) {
//                 }
                
//             }
            
//         }
//         else if(r instanceof ShapedRecipes){
//             ShapedRecipes recipe = r
//             if(isLP(recipe.recipeOutput)){

//             }
//         }
//     }
// })

def boolean isLP(ItemStack stack){
   stack.delegate.name().namespace.equals("logisticspipes") 
}
// [
// item('logisticspipes:frame'),
// item('logisticspipes:power_junction'),
// item('logisticspipes:security_station'),
// item('logisticspipes:pipe_transport_basic'),
// item('logisticspipes:pipe_controller'),
// item('logisticspipes:pipe_manager'),
// item('logisticspipes:logistics_programmer'),
// item('logisticspipes:crafting_table'),
// item('logisticspipes:crafting_table_fuzzy'),
// item('logisticspipes:statistics_table'),
// item('logisticspipes:program_compiler'),
// item('logisticspipes:remote_orderer')
// ].iterator().forEachRemaining({item -> 

// })
// w 0f<a<BS>item('<Esc>f>a<BS>')<Esc>
crafting.replaceShaped(item('logisticspipes:pipe_transport_basic') * 8, [[ore('plateIron'), ore('dustRedstone'), ore('plateIron')], [ore('blockGlass'), null, ore('blockGlass')], [ore('plateIron'), ore('dustRedstone'), ore('plateIron')]]);
crafting.removeByOutput(item('logisticspipes:chip_fpga_raw'))
crafting.removeByOutput(item('logisticspipes:chip_basic_raw'))
crafting.removeByOutput(item('logisticspipes:chip_advanced_raw'))
crafting.addShaped(item('logisticspipes:chip_fpga') * 8, [[ore('sand'), ore('circuitBasic'), ore('sand')], [ore('plateGold'), ore('dustRedstone'), ore('plateGold')], [ore('sand'), ore('gemLapis'), ore('sand')]]);
crafting.addShaped(item('logisticspipes:chip_fpga') * 16, [[ore('sand'), ore('circuitAdvanced'), ore('sand')], [ore('plateGold'), ore('dustRedstone'), ore('plateGold')], [ore('sand'), ore('gemLapis'), ore('sand')]]);
crafting.shapedBuilder()
    .key('c',ore('plateCopper'))
    .key('b',ore('circuitBasic'))
    .row(' c ')
    .row('cbc')
    .row(' c ')
    .output(item('logisticspipes:chip_basic')*8)
    .register()
crafting.shapedBuilder()
    .key('c',ore('plateCopper'))
    .key('b',ore('circuitAdvanced'))
    .row(' c ')
    .row('cbc')
    .row(' c ')
    .output(item('logisticspipes:chip_advanced')*8)
    .register()
    mods.chisel.carving.addGroup("lp_modules")
    mods.chisel.carving.addGroup("lp_upgrades")
    mods.chisel.carving.addGroup("pipe_1")
    mods.chisel.carving.addGroup("pipe_2")
    mods.chisel.carving.addGroup("pipe_3")
for (ItemStack stack in [
item('logisticspipes:module_item_sink'),
item('logisticspipes:module_passive_supplier'),
item('logisticspipes:module_extractor'),
item('logisticspipes:module_item_sink_polymorphic'),
item('logisticspipes:module_quick_sort'),
item('logisticspipes:module_terminus'),
item('logisticspipes:module_extractor_advanced'),
item('logisticspipes:module_provider'),
item('logisticspipes:module_item_sink_mod'),
item('logisticspipes:module_item_sink_oredict'),
item('logisticspipes:module_enchantment_sink'),
item('logisticspipes:module_enchantment_sink_mk2'),
item('logisticspipes:module_item_sink_creativetab'),
item('logisticspipes:module_crafter'),
item('logisticspipes:module_active_supplier'),
]) {
    crafting.removeByOutput(stack)
    mods.chisel.carving.addVariation("lp_modules",stack)
}
for (ItemStack stack in [
item('logisticspipes:upgrade_sneaky_combination'),
item('logisticspipes:upgrade_sneaky'),
item('logisticspipes:upgrade_speed'),
item('logisticspipes:upgrade_disconnection'),
item('logisticspipes:upgrade_satellite_advanced'),
item('logisticspipes:upgrade_fluid_crafting'),
item('logisticspipes:upgrade_crafting_byproduct'),
item('logisticspipes:upgrade_pattern'),
item('logisticspipes:upgrade_fuzzy'),
item('logisticspipes:upgrade_power_transportation'),
// item('logisticspipes:upgrade_power_supplier_mj'),
// item('logisticspipes:upgrade_power_supplier_rf'),
// item('logisticspipes:upgrade_power_supplier_eu_lv'),
// item('logisticspipes:upgrade_power_supplier_eu_mv'),
// item('logisticspipes:upgrade_power_supplier_eu_hv'),
// item('logisticspipes:upgrade_power_supplier_eu_ev'),
// item('logisticspipes:upgrade_cc_remote_control'),
item('logisticspipes:upgrade_crafting_monitoring'),
item('logisticspipes:upgrade_opaque'),
item('logisticspipes:upgrade_crafting_cleanup'),
item('logisticspipes:upgrade_module_upgrade'),
item('logisticspipes:upgrade_action_speed'),
item('logisticspipes:upgrade_item_extraction'),
item('logisticspipes:upgrade_item_stack_extraction'),
]) {
    crafting.removeByOutput(stack)
    mods.chisel.carving.addVariation("lp_upgrades",stack)
}
crafting.addShaped(item('logisticspipes:upgrade_speed'), [[ore('dustRedstone'), ore('dustRedstone'), ore('dustRedstone')], [ore('plateIron'), item('logisticspipes:chip_basic'), ore('plateIron')], [ore('paper'), ore('nuggetGold'), ore('paper')]]);
crafting.addShaped(item('logisticspipes:module_item_sink'), [[ore('dustRedstone'), item('logisticspipes:chip_fpga'), ore('dustRedstone')], [ore('plateIron'), item('logisticspipes:module_blank:*'), ore('plateIron')]]);


// frame
crafting.removeByOutput(item('logisticspipes:frame'))
crafting.addShapeless(item('logisticspipes:frame'),[
    ore('machineBlockBasic')
])

for (ItemStack stack in [
item('logisticspipes:pipe_request'),
item('logisticspipes:pipe_provider'),
item('logisticspipes:pipe_crafting'),
item('logisticspipes:pipe_satellite'),
item('logisticspipes:pipe_supplier'),
item('logisticspipes:pipe_chassis_mk1'),
item('logisticspipes:pipe_chassis_mk2'),
item('logisticspipes:pipe_chassis_mk3'),
]){
    crafting.removeByOutput(stack)
    mods.chisel.carving.addVariation("pipe_1",stack)

}
for (ItemStack stack in [
item('logisticspipes:pipe_chassis_mk4'),
item('logisticspipes:pipe_chassis_mk5'),
item('logisticspipes:pipe_request_mk2'),
item('logisticspipes:pipe_remote_orderer'),
item('logisticspipes:pipe_inventory_system_connector'),
item('logisticspipes:pipe_system_entrance'),
item('logisticspipes:pipe_system_destination'),
item('logisticspipes:pipe_firewall'),
]){
    crafting.removeByOutput(stack)
    mods.chisel.carving.addVariation("pipe_2",stack)

}
for (ItemStack stack in [
item('logisticspipes:pipe_fluid_basic'),
item('logisticspipes:pipe_fluid_supplier'),
item('logisticspipes:pipe_fluid_insertion'),
item('logisticspipes:pipe_fluid_provider'),
item('logisticspipes:pipe_fluid_request'),
item('logisticspipes:pipe_fluid_extractor'),
item('logisticspipes:pipe_fluid_satellite'),
item('logisticspipes:pipe_fluid_supplier_mk2'),
item('logisticspipes:pipe_fluid_terminus'),
]){
    crafting.removeByOutput(stack)
    mods.chisel.carving.addVariation("pipe_3",stack)

}

crafting.addShaped(item('logisticspipes:pipe_fluid_basic'), [[item('logisticspipes:chip_basic'), item('logisticspipes:pipe_basic:*'), item('logisticspipes:chip_basic')], [ore('plateGold'), item('minecraft:bucket:*'), ore('plateGold')]]);
crafting.addShaped(item('logisticspipes:pipe_chassis_mk1'), [[ore('plateIron'), item('logisticspipes:chip_basic'), ore('plateIron')], [item('logisticspipes:chip_fpga'), item('logisticspipes:pipe_basic:*'), item('logisticspipes:chip_fpga')]]);
crafting.addShaped(item('logisticspipes:pipe_chassis_mk4'), [[ore('plateSteel'),item('logisticspipes:chip_advanced'),ore('plateSteel')],[ore('plateGold'), item('logisticspipes:chip_basic'), ore('plateGold')], [item('logisticspipes:chip_fpga'), item('logisticspipes:pipe_basic:*'), item('logisticspipes:chip_fpga')]]);


