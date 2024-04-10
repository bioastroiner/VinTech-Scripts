import gtc_expansion.GTCExpansion;
import gtclassic.api.helpers.GTValues;
import gtclassic.api.material.GTMaterial;
import gtclassic.api.material.GTMaterialFlag;
import gtclassic.api.material.GTMaterialGen;
import net.minecraftforge.fml.common.Loader;
// public static final GTMaterialFlag fluid = GTMaterialFlag.FLUID;
// public static final GTMaterialFlag dust = GTMaterialFlag.DUST;
// public static final GTMaterialFlag ingot = GTMaterialFlag.INGOT;
/*
andesite
basalt
black_granite
blueschist
chalk
dacite_slab_top
dolomite
eclogite
gabbro
gneiss
greenschist
greywacke
komatiite
lignite
limestone
marble
migmatite
quartzite
red_granite
rhyolite
shale
siltstone
soapstone
*/
// static final List<String> rocks = [
//     andesite,
//     basalt,
//     black_granite,
//     blueschist,
//     chalk,
//     dacite_slab_top,
//     dolomite,
//     eclogite,
//     gabbro,
//     gneiss,
//     greenschist,
//     greywacke,
//     komatiite,
//     lignite,
//     limestone,
//     marble,
//     migmatite,
//     quartzite,
//     red_granite,
//     rhyolite,
//     shale,
//     siltstone,
//     soapstone
// ]
// static final HashMap<String,List<Integer>> ROCK_STATS = null

// final Map<String,GTMaterial> DUST_MAP = new HashMap<>()

initMaterials()
def initMaterials() {
    log.debug("Initilizing Material Gen...")
    dust("Phosphate",255, 243, 69)
    dust("Phosphin",255,200,200)
    dust("Phosphorite",255,150,150)
    dust("Uranite",14, 51, 0)
    dust("Tungstate",10,10,10)
    dust("Boran",100,50,50)
    dust("Cobaltite",70, 0, 255)
    dust("Magnetite",11, 16, 33) // as Black Sand -> sec source of Mangense
    dust("Limonite",50,200,200)
    dust("Rutile",255,100,0) //TiO2
    dust("Pentlandite") //(Fe, Ni)₉S₈ -> sec source of Os 
    dust("Mica",200,255,200)
    dust("Feldspar",255,200,200)
    dust("Pyroxene",255,150,150)
    dust("Amphibole")
    dust("Dolomite")
}
def GTMaterial dust(String name){
    dust(name,0,0,0)
}
def GTMaterial dust(String name, int r,int g, int b){
    log.debug("Registering Dust $name")
    def _ = new GTMaterial(name,r,g,b,GTMaterialFlag.DUST)
    _
}
def GTMaterial fluid(String name){
    fluid(name,0,0,0);
}
def GTMaterial fluid(String name, int r, int g, int b){
    log.debug("Registering Fluid $name")
    def _ = new GTMaterial(name,r,g,b,GTMaterialFlag.FLUID)
    _
}
def GTMaterial ingot(String name, int r, int g, int b){
    log.debug("Registering Ingot $name")
    def _ = new GTMaterial(name,r,g,b,GTMaterialFlag.INGOT)
    _
}
def GTMaterial setHeat(GTMaterial material, int heat){

}


/*
!exists in base gtc_expansion:
GTMaterial Almandine = new GTMaterial("Almandine", 255, 0, 0, dustAll);
GTMaterial Andradite = new GTMaterial("Andradite", 150, 120, 0, dustAll);
GTMaterial Antimony = setHeat(new GTMaterial(51,"Antimony", 1, 220, 220, 240, molten, smalldust, dust, tinydust, nugget, ingot, plate, stick, gear, blockMetal), 903);
GTMaterial Ashes = new GTMaterial("Ashes", 192, 192, 192, dustAll);
GTMaterial BatteryAlloy = new GTMaterial("BatteryAlloy", 95, 77, 126, dust, ingot, smalldust, nugget, plate);
GTMaterial BioFuel = new GTMaterial("BioFuel", 153, 204, 0, fluid);
GTMaterial Brass = setHeat(new GTMaterial("Brass", 1, 255, 180, 0, molten, smalldust, dust, nugget, ingot, plate, stick, gear, blockMetal, hull), 1160);
GTMaterial Bronze = setHeat(new GTMaterial("Bronze", 1, 255, 128, 0, molten, smalldust, nugget, plate, stick, gear, hull, turbineBlade, brokenTurbineRotor), 1357);
GTMaterial CarbonDioxide = new GTMaterial("CarbonDioxide", 40, 40, 40, gas);
GTMaterial Cassiterite = new GTMaterial("Cassiterite", 220, 220, 220, false, crushedAll);
GTMaterial Charcoal = new GTMaterial("Charcoal", 100, 70, 70, smalldust);
GTMaterial Chromite = new GTMaterial("Chromite", 35, 20, 15, crushedAll);
GTMaterial Cinnabar = new GTMaterial("Cinnabar", 150, 0, 0, crushedAll);
GTMaterial Clay = new GTMaterial("Clay", 200, 200, 220, smalldust);
GTMaterial Coal = new GTMaterial("Coal", 70, 70, 70, smalldust);
GTMaterial CoalFuel = new GTMaterial("CoalFuel", 0, 0, 0, fluid);
GTMaterial Coke = new GTMaterial("Coke", 140, 140, 170, dust, smalldust);
GTMaterial Constantan = setHeat(new GTMaterial("Constantan", 2, 227, 150, 128, dust, ingot, blockMetal, molten, smalldust, nugget, plate, stick),1542);
GTMaterial Copper = setHeat(new GTMaterial(29,"Copper", 180, 113, 61, molten, smalldust, nugget, plate, stick, gear, crushedore, crushedorePurified, tinydust),1357);
GTMaterial Creosote = new GTMaterial("Creosote", 128, 64, 0, GTMaterialFlag.NULL);
GTMaterial DarkAshes = new GTMaterial("DarkAshes", 50, 50, 50, dustAll);
GTMaterial Diamond = new GTMaterial("Diamond", 51, 235, 203, dustAll);
GTMaterial Diesel = new GTMaterial("Diesel", 255, 255, 0, fluid);
GTMaterial Endstone = new GTMaterial("Endstone", 250, 250, 198, dustAll);
GTMaterial Galena = new GTMaterial("Galena", 100, 60, 100, smalldust, dust, crushedore, crushedorePurified);
GTMaterial GarnetRed = new GTMaterial("RedGarnet", 200, 80, 80, gemAll3);
GTMaterial GarnetYellow = new GTMaterial("YellowGarnet", 200, 200, 80, dust, smalldust, gemGarnetShape, blockGem, tinydust);
GTMaterial Gasoline = new GTMaterial("Gasoline", 132, 114, 62, fluid);
GTMaterial Glowstone = new GTMaterial("Glowstone", 255, 255, 0, smalldust);
GTMaterial Glyceryl = new GTMaterial("Glyceryl",52, 157, 157, fluid);
GTMaterial Gold = setHeat(new GTMaterial(79,"Gold", 1, 255, 255, 30, molten, smalldust, plate, stick, gear, crushedore, crushedorePurified, tinydust), 1337);
GTMaterial Granite = new GTMaterial("Granite", 165, 89, 39, dustAll);
GTMaterial Grossular = new GTMaterial("Grossular", 200, 100, 0, dust, smalldust, tinydust);
GTMaterial Gunpowder = new GTMaterial("Gunpowder", 128, 128, 128, smalldust);
GTMaterial HotCoolant = new GTMaterial("HotCoolant", 233, 40, 40, fluid);
GTMaterial Iron = setHeat(new GTMaterial(26,"Iron", 1, 184, 184, 184, molten, smalldust, plate, stick, gear, crushedorePurified, crushedore, tinydust), 1811);
GTMaterial Kanthal = new GTMaterial("Kanthal", 219, 191, 111, false, dust, smalldust, nugget, ingot, plate, hotIngot);
GTMaterial Lead = setHeat(new GTMaterial(82,"Lead", 140, 100, 140, molten, smalldust, dust, nugget, ingot, plate, stick, gear, blockMetal, tinydust, crushedore, crushedorePurified), 600);
GTMaterial Magnalium = setHeat(new GTMaterial("Magnalium", 2, 200, 190, 255, molten, smalldust, dust, nugget, ingot, plate, stick, turbineBlade, blockMetal, brokenTurbineRotor),929);
GTMaterial Magnesium = new GTMaterial(12,"Magnesium", 255, 200, 200, dustAll);
GTMaterial Manganese = setHeat(new GTMaterial(25,"Manganese", 2, 250, 235, 250, molten, smalldust, dust, tinydust, nugget, ingot, plate, blockMetal), 1519);
GTMaterial Marble = new GTMaterial("Marble", 200, 200, 200, dustAll);
GTMaterial Naphtha = new GTMaterial("Naphtha", 255, 255, 100, fluid);
GTMaterial Netherrack = new GTMaterial("Netherrack", 200, 0, 0, smalldust);
GTMaterial Nichrome = setHeat(new GTMaterial(-1,"Nichrome", 3, 205, 206, 246, false, molten, smalldust, dust, nugget, ingot, plate, stick, hotIngot), 1818);
GTMaterial NitricAcid = new GTMaterial("NitricAcid", 187, 165, 35, fluid);
GTMaterial NitroCarbon = new GTMaterial("NitroCarbon", 31, 94, 94, fluid);
GTMaterial NitroCoalFuel = new GTMaterial("NitroCoalFuel", 0, 43, 43, fluid);
GTMaterial NitroDiesel = new GTMaterial("NitroDiesel", 191, 255, 100, fluid);
GTMaterial NitrogenDioxide = new GTMaterial("NitrogenDioxide", 109, 185, 185, fluid);
GTMaterial Obsidian = new GTMaterial("Obsidian", 80, 50, 100, smalldust);
GTMaterial OilCrude = new GTMaterial("Crude_Oil", 0, 0, 0, fluid);
GTMaterial Olivine = new GTMaterial("Olivine", 150, 255, 150, gemAll1);
GTMaterial Osmium = setHeat(new GTMaterial(76,"Osmium", 5, 50, 50, 255, false, molten, smalldust, dust, nugget, ingot, hotIngot, plate, stick, gear, blockMetal, tinydust, turbineBlade, brokenTurbineRotor), 3306);
GTMaterial Osmiridium = setHeat(new GTMaterial(0,"Osmiridium", 6, 100, 100, 255, false, molten, smalldust, dust, nugget, ingot, hotIngot, plate, stick, gear, blockMetal, turbineBlade, brokenTurbineRotor), 3450);
GTMaterial Propane = new GTMaterial("Propane", 81, 27, 27, gas);
GTMaterial Pyrope = new GTMaterial("Pyrope", 120, 50, 100, dustAll);
GTMaterial RedAlloy = setHeat(new GTMaterial("RedAlloy", 1, 200, 0, 0, molten, smalldust, dust, ingot, plate, nugget, stick), 1400);
GTMaterial RedRock = new GTMaterial("RedRock", 255, 80, 50, dustAll);
GTMaterial Redstone = new GTMaterial("Redstone", 200, 0, 0, smalldust, tinydust);
GTMaterial RefinedIron = setHeat(new GTMaterial("RefinedIron", 1, 220, 235, 235, stick, plate, gear, hull, molten), 2011);
GTMaterial Saltpeter = new GTMaterial("Saltpeter", 230, 230, 230, dustAll);
GTMaterial SiliconDioxide = new GTMaterial("SiliconDioxide", 250, 250, 250, dustAll);
GTMaterial Silver = setHeat(new GTMaterial("Silver", 215, 225, 230, molten, smalldust, nugget, plate, stick, gear, crushedore, crushedorePurified, tinydust), 1234);
GTMaterial Slag = new GTMaterial("Slag", 64, 48, 0, dustAll);
GTMaterial SodiumPersulfate = new GTMaterial("SodiumPersulfate", 0, 102, 70, fluid);
GTMaterial SodiumSulfide = new GTMaterial("SodiumSulfide", 161, 168, 73, fluid);
GTMaterial Spessartine = new GTMaterial("Spessartine", 255, 100, 100, dustAll);
GTMaterial Sphalerite = new GTMaterial("Sphalerite", 200, 140, 40, crushedAll);
GTMaterial StainlessSteel = setHeat(new GTMaterial(-1, "StainlessSteel", 3, 200, 200, 220, false, molten, smalldust, dust, nugget, ingot, plate, stick, gear, blockMetal, hull), 1943);
GTMaterial Steel = setHeat(new GTMaterial(-1, "Steel", 2, 128, 128, 128, false, molten, smalldust, dust, nugget, ingot, plate, stick, gear, blockMetal, hull, turbineBlade, brokenTurbineRotor), 2046);
GTMaterial Stone = new GTMaterial("Stone", 196, 196, 196, dustAll);
GTMaterial SulfuricAcid = new GTMaterial("SulfuricAcid", 255, 106, 0, fluid);
GTMaterial Tetrahedrite = new GTMaterial("Tetrahedrite", 200, 32, 0 , smalldust, dust, crushedore, crushedorePurified);
GTMaterial Tin = setHeat(new GTMaterial("Tin", 220, 220, 220, molten, smalldust, nugget, plate, stick, gear, crushedore, crushedorePurified, tinydust), 505);
GTMaterial TungstenSteel = setHeat(new GTMaterial(-1, "Tungstensteel", 4, 100, 100, 160, false, molten, smalldust, dust, nugget, ingot, hotIngot, plate, stick, gear, blockMetal, hull, turbineBlade, brokenTurbineRotor), 3600);
GTMaterial Uvarovite = new GTMaterial("Uvarovite", 180, 255, 180, dustAll);
GTMaterial Zinc = setHeat(new GTMaterial(30,"Zinc", 1, 250, 240, 240, molten, smalldust, dust, nugget, ingot, plate, stick, gear, blockMetal, tinydust), 692);
*/