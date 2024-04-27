import crafttweaker.api.event.PlayerRightClickBlockEvent
// salt loop
crafting.remove("harvestcraft:freshwateritem_listallwater")

// TE's hammer
hammer = item('thermalfoundation:tool.hammer_bronze')

crafting.removeByOutput(item("thermalfoundation:tool.hammer_copper"))
crafting.removeByOutput(item("thermalfoundation:tool.hammer_bronze"))
crafting.removeByOutput(item("thermalfoundation:tool.hammer_tin"))
crafting.removeByOutput(item("thermalfoundation:tool.hammer_tin"))

// eventManager.listen({event -> 
//     if(event instanceof PlayerRightClickBlockEvent){
//         ((PlayerRightClickBlockEvent) event).getUseItem()
//     }

// })