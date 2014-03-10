	

    package tutorial.basic;
     
    import tutorial.basic.CommonProxy;
    import cpw.mods.fml.common.Mod;
    import cpw.mods.fml.common.Mod.EventHandler;
    import cpw.mods.fml.common.Mod.Instance;
    import cpw.mods.fml.common.SidedProxy;
    import cpw.mods.fml.common.event.FMLInitializationEvent;
    import cpw.mods.fml.common.event.FMLPostInitializationEvent;
    import cpw.mods.fml.common.event.FMLPreInitializationEvent;
    import cpw.mods.fml.common.network.NetworkMod;
     
    @Mod(modid="Basic", name="Basic", version="0.0.0")
    @NetworkMod(clientSideRequired=true, serverSideRequired=false)
    public class Basic {
     
            // The instance of your mod that Forge uses.
            @Instance("Basic")
            public static Basic instance;
           
            // Says where the client and server 'proxy' code is loaded.
            @SidedProxy(clientSide="tutorial.basic.client.ClientProxy", serverSide="tutorial.basic.CommonProxy")
            public static CommonProxy proxy;
           
            @EventHandler
            public void preInit(FMLPreInitializationEvent event) {
                    // Stub Method
            }
           
            @EventHandler
            public void load(FMLInitializationEvent event) {
                    proxy.registerRenderers();
            }
           
            @EventHandler
            public void postInit(FMLPostInitializationEvent event) {
                    // Stub Method
            }
           
    }

