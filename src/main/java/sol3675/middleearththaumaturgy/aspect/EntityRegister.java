package sol3675.middleearththaumaturgy.aspect;

import lotr.common.entity.LOTREntities;
import lotr.common.entity.npc.*;
import lotr.common.entity.projectile.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityThrowable;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

import java.util.Map;

import static lotr.common.entity.LOTREntities.classToIDMapping;

public class EntityRegister {

    public static void init(){
        for (Map.Entry<Class<? extends Entity>,Integer> classAndID:classToIDMapping.entrySet()){
            Class<? extends Entity> entityClass = classAndID.getKey();
            int id = classAndID.getValue();
            String entityName = LOTREntities.IDToStringMapping.get(id);
            AspectList toAdd = new AspectList();

            if (EntityThrowable.class.isAssignableFrom(entityClass) || LOTREntityProjectileBase.class.isAssignableFrom(entityClass)){
                toAdd.add(Aspect.WEAPON,1);
                if (LOTREntityProjectileBase.class.isAssignableFrom(entityClass)){
                    toAdd.add(Aspect.WEAPON,1);
                    if (LOTREntityDart.class.isAssignableFrom(entityClass)
                            || LOTREntityCrossbowBolt.class.isAssignableFrom(entityClass)
                    ){
                        toAdd.add(Aspect.METAL,1);
                    }
                }
                if (LOTREntityFirePot.class.isAssignableFrom(entityClass)){
                    toAdd.add(Aspect.FIRE,1);
                }
                if (LOTREntityConker.class.isAssignableFrom(entityClass)){
                    toAdd.add(Aspect.CROP,1);
                }
                if (LOTREntityGandalfFireball.class.isAssignableFrom(entityClass)){
                    toAdd.add(Aspect.FIRE,2);
                    toAdd.add(MiddleEarthAspects.WIZARDS,2);
                }
                if (LOTREntityMallornLeafBomb.class.isAssignableFrom(entityClass)){
                    toAdd.add(Aspect.PLANT,1);
                    toAdd.add(Aspect.ENERGY,1);
                    toAdd.add(Aspect.FIRE,2);
                    toAdd.add(MiddleEarthAspects.LINDON,2);
                }
                if (LOTREntityMarshWraithBall.class.isAssignableFrom(entityClass)){
                    toAdd.add(Aspect.MAGIC,1);
                    toAdd.add(Aspect.FIRE,1);
                }
                if (LOTREntityMysteryWeb.class.isAssignableFrom(entityClass)){
                    toAdd.add(Aspect.MAGIC,1);
                    toAdd.add(Aspect.TRAP,1);
                }
                if (LOTREntityPebble.class.isAssignableFrom(entityClass) || LOTREntityThrownRock.class.isAssignableFrom(entityClass)){
                    toAdd.add(Aspect.EARTH,1);
                    toAdd.add(Aspect.ENTROPY,1);
                }
                if (LOTREntityPlate.class.isAssignableFrom(entityClass)){
                    toAdd.add(Aspect.CRYSTAL,1);
                }
                if (LOTREntitySmokeRing.class.isAssignableFrom(entityClass)){
                    toAdd.add(Aspect.FIRE,1);
                    toAdd.add(Aspect.ENTROPY,1);
                }
                if (LOTREntitySpear.class.isAssignableFrom(entityClass)){
                    toAdd.add(Aspect.WEAPON,1);
                }
                if (LOTREntityThrowingAxe.class.isAssignableFrom(entityClass)){
                    toAdd.add(Aspect.WEAPON,1);
                }
                if (LOTREntityThrownTermite.class.isAssignableFrom(entityClass)){
                    toAdd.add(Aspect.BEAST,1);
                    toAdd.add(Aspect.FIRE,1);
                    toAdd.add(Aspect.ENERGY,1);
                    toAdd.add(Aspect.ENTROPY,1);
                }
                if (LOTREntityTrollSnowball.class.isAssignableFrom(entityClass)){
                    toAdd.add(Aspect.COLD,1);
                }
            }

            if (LOTREntityFishHook.class.isAssignableFrom(entityClass)){
                toAdd.add(Aspect.HARVEST,1);
                toAdd.add(Aspect.TOOL,1);
            }

            if (LOTREntityTree.class.isAssignableFrom(entityClass)){
                toAdd.add(Aspect.TREE,3);
                if (LOTREntityEnt.class.isAssignableFrom(entityClass)){
                    toAdd.add(MiddleEarthAspects.ENTS,2);
                    if (LOTREntityMallornEnt.class.isAssignableFrom(entityClass)){
                        toAdd.add(MiddleEarthAspects.IMMORTAL,2);
                    }
                }
//                if (LOTREntityHuornBase.class.isAssignableFrom(entityClass)){
//
//                    if (LOTREntityHuorn.class.isAssignableFrom(entityClass)){
//
//                    }
//                    if (LOTREntityDarkHuorn.class.isAssignableFrom(entityClass)){
//
//                    }
//                }
            }

            if (LOTREntityNPC.class.isAssignableFrom(entityClass)){
                if (LOTREntityNPCRideable.class.isAssignableFrom(entityClass)){

                    if (LOTREntityWarg.class.isAssignableFrom(entityClass)){
                        toAdd.add(Aspect.BEAST,3);
                        if (LOTREntityUtumnoWarg.class.isAssignableFrom(entityClass)){
                            toAdd.add(MiddleEarthAspects.IMMORTAL,2);
                            if (LOTREntityUtumnoIceWarg.class.isAssignableFrom(entityClass)){
                                toAdd.add(Aspect.COLD,2);
                            }
                        }
                    }
                    if (LOTREntitySpiderBase.class.isAssignableFrom(entityClass)){
                        toAdd.add(Aspect.BEAST,3);
                        if (LOTREntityUtumnoIceSpider.class.isAssignableFrom(entityClass)){
                            toAdd.add(MiddleEarthAspects.IMMORTAL,2);
                            toAdd.add(Aspect.COLD,2);
                        }
                    }
                }
                if (LOTREntityDwarf.class.isAssignableFrom(entityClass)){
                    toAdd.add(MiddleEarthAspects.DWARVES,3);

                }
                if (LOTREntityOrc.class.isAssignableFrom(entityClass)){
                    toAdd.add(MiddleEarthAspects.ORCS,3);
                    if (LOTREntityAngmarOrc.class.isAssignableFrom(entityClass)){
                        toAdd.add(MiddleEarthAspects.ANGMAR,2);
                    }
                    if (LOTREntityUrukHai.class.isAssignableFrom(entityClass)){
                        toAdd.add(MiddleEarthAspects.URUKS,2);
                    }
                    if (LOTREntityMordorOrc.class.isAssignableFrom(entityClass)){
                        toAdd.add(MiddleEarthAspects.MORDOR,2);
                    }
                    if (LOTREntityDolGuldurOrc.class.isAssignableFrom(entityClass)){
                        toAdd.add(MiddleEarthAspects.DOLGULDUR,2);
                    }
                    if (LOTREntityGundabadOrc.class.isAssignableFrom(entityClass)){
                        toAdd.add(MiddleEarthAspects.GUNDABAD,2);
                    }
                    if (LOTREntityIsengardSnaga.class.isAssignableFrom(entityClass)){
                        toAdd.add(MiddleEarthAspects.ISENGARD,2);
                    }
                    if (LOTREntityUtumnoOrc.class.isAssignableFrom(entityClass)){
                        toAdd.add(MiddleEarthAspects.UTUMNO,2);
                    }
                }
                if (LOTREntityMan.class.isAssignableFrom(entityClass)){
                    toAdd.add(MiddleEarthAspects.HOBBITS,3);
                    if (LOTREntityRohanMan.class.isAssignableFrom(entityClass)){
                        toAdd.add(MiddleEarthAspects.ROHAN,2);
                    }
                    if (LOTREntityAngmarHillman.class.isAssignableFrom(entityClass)){
                        toAdd.add(MiddleEarthAspects.ANGMAR,2);
                    }
                    if (LOTREntityBandit.class.isAssignableFrom(entityClass)){
                        toAdd.add(Aspect.GREED,3);
                    }
                    if (LOTREntityBreeMan.class.isAssignableFrom(entityClass)){
                        toAdd.add(MiddleEarthAspects.BREE,2);
                    }
                    if (LOTREntityDorwinionMan.class.isAssignableFrom(entityClass)){
                        toAdd.add(MiddleEarthAspects.DORWINION,2);
                    }
                    if (LOTREntityDaleMan.class.isAssignableFrom(entityClass)){
                        toAdd.add(MiddleEarthAspects.DALE,2);
                    }
                    if (LOTREntityDunedain.class.isAssignableFrom(entityClass)){
                        toAdd.add(MiddleEarthAspects.DUNEDAIN,2);
                    }
                    if (LOTREntityDunlending.class.isAssignableFrom(entityClass)){
                        toAdd.add(MiddleEarthAspects.DUNLAND,2);
                    }
                    //no aspect
//                    if (LOTREntityEasterling.class.isAssignableFrom(entityClass)){
//                        toAdd.add(MiddleEarthAspects.)
//                    }
                    if (LOTREntityTauredain.class.isAssignableFrom(entityClass)){
                        toAdd.add(MiddleEarthAspects.TAUREDAIN,2);
                    }
                    if (LOTREntityScrapTrader.class.isAssignableFrom(entityClass)){
                        toAdd.add(Aspect.ENTROPY,2);
                    }
                    if (LOTREntityNurnSlave.class.isAssignableFrom(entityClass)){
                        toAdd.add(Aspect.HARVEST,2);
                        //no aspect for nurn
                    }
                    if (LOTREntityGondorMan.class.isAssignableFrom(entityClass)){
                        toAdd.add(MiddleEarthAspects.GONDOR,2);
                    }
                    if (LOTREntityHaradSlave.class.isAssignableFrom(entityClass)){
                        toAdd.add(Aspect.HARVEST,2);
                        //we don't have harad,use near one instead
                        toAdd.add(MiddleEarthAspects.NEARHARAD,2);
                    }
                    if (LOTREntityMoredain.class.isAssignableFrom(entityClass)){
                        toAdd.add(MiddleEarthAspects.MOREDAIN,2);
                    }
                    if (LOTREntityNearHaradrimBase.class.isAssignableFrom(entityClass)){
                        toAdd.add(MiddleEarthAspects.NEARHARAD,2);
                        if (LOTREntityHarnedhrim.class.isAssignableFrom(entityClass)){
                            toAdd.add(MiddleEarthAspects.NEARHARAD,2);
                        }
//                        if (LOTREntityGulfHaradrim.class.isAssignableFrom(entityClass)){
//                            toAdd.add(MiddleEarthAspects.,2);
//                        }
                        if (LOTREntityNearHaradrim.class.isAssignableFrom(entityClass)){
                            toAdd.add(MiddleEarthAspects.NEARHARAD,2);
                        }
//                        if (LOTREntityNomad.class.isAssignableFrom(entityClass)){
//                            toAdd.add(MiddleEarthAspects.,2);
//                        }
//                        if (LOTREntityUmbarian.class.isAssignableFrom(entityClass)){
//
//                        }
                    }
                    if (LOTREntityHobbit.class.isAssignableFrom(entityClass)){
                        toAdd.add(Aspect.GREED,3);

                    }
                }
                if (LOTREntityElf.class.isAssignableFrom(entityClass)){
                    toAdd.add(MiddleEarthAspects.ELVES,3);
                    if (LOTREntityGaladhrimElf.class.isAssignableFrom(entityClass)){
                        toAdd.add(MiddleEarthAspects.LOTHLORIEN,2);
                    }
                    if (LOTREntityDorwinionElf.class.isAssignableFrom(entityClass)){
                        toAdd.add(MiddleEarthAspects.DORWINION,2);
                    }
                    if (LOTREntityHighElfBase.class.isAssignableFrom(entityClass)){
                        toAdd.add(MiddleEarthAspects.LINDON,2);
//                        if (LOTREntityRivendellElf.class.isAssignableFrom(entityClass)){
//                            toAdd.add()
//                        }
                    }
                    if (LOTREntityTormentedElf.class.isAssignableFrom(entityClass)){
                        toAdd.add(Aspect.TRAP,2);
                    }
                    if (LOTREntityWoodElf.class.isAssignableFrom(entityClass)){
                        toAdd.add(MiddleEarthAspects.WOODLAND,2);
                    }
                }
                if (LOTREntityHalfTroll.class.isAssignableFrom(entityClass)){
                    toAdd.add(MiddleEarthAspects.HALFTROLLS,2);
                }
                if (LOTREntitySkeletalWraith.class.isAssignableFrom(entityClass)){
                    toAdd.add(Aspect.SOUL,4);
                    if (LOTREntityHaradPyramidWraith.class.isAssignableFrom(entityClass)){
                        toAdd.add(MiddleEarthAspects.NEARHARAD,3);
                    }
                    if (LOTREntityRohanBarrowWraith.class.isAssignableFrom(entityClass)){
                        toAdd.add(MiddleEarthAspects.ROHAN,3);
                    }
                    if (LOTREntityGondorRuinsWraith.class.isAssignableFrom(entityClass)){
                        toAdd.add(MiddleEarthAspects.GONDOR,3);
                    }
                    if (LOTREntityTauredainPyramidWraith.class.isAssignableFrom(entityClass)){
                        toAdd.add(MiddleEarthAspects.TAUREDAIN,3);
                    }
                }

            }
            if (LOTRBoss.class.isAssignableFrom(entityClass)){
                toAdd.add(MiddleEarthAspects.IMMORTAL,2);
            }
            if (LOTRTravellingTrader.class.isAssignableFrom(entityClass)){
                toAdd.add(Aspect.GREED,2);
                toAdd.add(Aspect.EXCHANGE,2);
            }
            if (LOTRTradeable.class.isAssignableFrom(entityClass)){
                toAdd.add(Aspect.GREED,2);
                toAdd.add(Aspect.EXCHANGE,2);
            }
            if (LOTRUnitTradeable.class.isAssignableFrom(entityClass)){
                toAdd.add(Aspect.GREED,2);
                toAdd.add(Aspect.EXCHANGE,2);
            }
            if (LOTRFarmhand.class.isAssignableFrom(entityClass)){
                toAdd.add(Aspect.HARVEST,2);
            }
            if (LOTRTradeable.Smith.class.isAssignableFrom(entityClass)){
                toAdd.add(Aspect.METAL,2);
            }
            if (entityClass.toString().toLowerCase().contains("utumno")){
                toAdd.add(MiddleEarthAspects.UTUMNO,4);
            }
            ThaumcraftApi.registerEntityTag(entityName,toAdd);
        }
    }
}
