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

