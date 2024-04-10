


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


def crusher(ItemStack output, ItemStack input) {
    crusher(output, input,null)
}
def crusher(ItemStack output, ItemStack input, ItemStack secondry) {
    int ieCrusherCost = 2048
   //  float secChance = 0.1f
    mods.immersiveengineering.crusher.add(output, input,ieCrusherCost)
    ic2.core.block.machine.low.TileEntityMacerator.addRecipe(input,output)
   //  println(input.displayName())
   // log.debug(input + ' added ',input)
}