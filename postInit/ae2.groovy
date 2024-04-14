// MOD_LOADED appliedenergistics2
crafting.replaceShaped(item('appliedenergistics2:inscriber'),[
    [ore('plateSteel'),ore('circuitAdvanced'),ore('plateSteel')],
    [ore('plateSteel'),item('gtc_expansion:platebender'),ore('plateSteel')],
    [ore('plateSteel'),ore('circuitAdvanced'),ore('plateSteel')],
]);
crafting.replaceShaped(item('appliedenergistics2:controller'),[
    [ore('plateAluminium'),ore('circuitAdvanced'),ore('plateAluminium')],
    [ore('crystalPureFluix'),item('appliedenergistics2:material', 24),ore('crystalPureFluix')],
    [ore('plateAluminium'),ore('circuitAdvanced'),ore('plateAluminium')],
])

furnace.removeByOutput(item('appliedenergistics2:material', 5))

crafting.removeByOutput(item('appliedenergistics2:part', 140))
crafting.addShaped(item('appliedenergistics2:part', 140)*3,[
    [item('appliedenergistics2:quartz_glass'),item('appliedenergistics2:quartz_glass'),item('appliedenergistics2:quartz_glass')],
    [item('ic2:itemcable', 9),item('ic2:itemcable', 9),item('ic2:itemcable', 9)],
    [item('appliedenergistics2:quartz_glass'),item('appliedenergistics2:quartz_glass'),item('appliedenergistics2:quartz_glass')],
])

