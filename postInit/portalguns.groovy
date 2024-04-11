
crafting.removeByOutput(item('portalgun:item_portalgun'));
crafting.removeByOutput(item('portalgun:item_miniature_black_hole'));
furnace.removeByOutput(item('portalgun:item_dust_ender_pearl'));
mods.jei.ingredient.hide(item('portalgun:item_dust_ender_pearl'));

crafting.addShaped("portal_gun", item('portalgun:item_portalgun'), [[ore('gemDiamond'), item('minecraft:obsidian'), item('ic2:itemportableteleporter')], [ore('plateTitanium'), ore('plateTitanium'), item('portalgun:item_miniature_black_hole')], [null, item('ic2:itemmisc:258'), item('ic2:itemmisc:258')]]);
crafting.addShaped("miniature_black_hole", <portalgun:item_miniature_black_hole>, [[item('ore:dustEnderPearl'), item('ore:dustEnderPearl'), item('ore:dustEnderPearl')], [item('ore:dustEnderPearl'), item('minecraft:nether_star'), item('ore:dustEnderPearl')], [item('ore:dustEnderPearl'), item('ore:dustEnderPearl'), item('ore:dustEnderPearl')]]);

ore('dustEnderPearl').remove(item('portalgun:item_dust_ender_pearl'));

// event_manager.listen {LootTablesLoadedEvent event ->
    // event.loot.getTable('portalgun:item_portalgun')
    //todo: keep this in zs until i figure this out
// mods.ltt.LootTable.removeGlobalItem("portalgun:item_portalgun");
// }